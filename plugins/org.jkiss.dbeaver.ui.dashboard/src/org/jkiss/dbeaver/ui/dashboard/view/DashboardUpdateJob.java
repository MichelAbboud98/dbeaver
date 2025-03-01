/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.dashboard.view;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.runtime.DBWorkbench;

/**
 * Job which runs every second and updates necessary dashboards
 */
public class DashboardUpdateJob extends AbstractJob {

    private static final Log log = Log.getLog(DashboardUpdateJob.class);

    private static final int JOB_DELAY = 1000;

    private DashboardUpdateJob() {
        super("Dashboard update");
    }

    @Override
    protected IStatus run(DBRProgressMonitor monitor) {

        try {
            new DashboardUpdater().updateDashboards(monitor);
        } catch (Exception e) {
            log.error("Error running dashboard updater", e);
        }

        if (!DBWorkbench.getPlatform().isShuttingDown()) {
            schedule(JOB_DELAY);
        }
        return Status.OK_STATUS;
    }

    public static void startUpdating() {
        new DashboardUpdateJob().schedule(JOB_DELAY);
    }

}