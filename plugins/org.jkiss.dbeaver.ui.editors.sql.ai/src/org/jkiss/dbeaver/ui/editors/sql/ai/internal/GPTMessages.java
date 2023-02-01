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
package org.jkiss.dbeaver.ui.editors.sql.ai.internal;

import org.eclipse.osgi.util.NLS;

public class GPTMessages extends NLS {
    static final String BUNDLE_NAME = "org.jkiss.dbeaver.ui.editors.sql.ai.internal.GPTMessages"; //$NON-NLS-1$


    public static String gpt_preference_page_checkbox_enable_gpt;
    public static String gpt_preference_page_group_authorization;
    public static String gpt_preference_page_selector_token;
    public static String gpt_preference_page_group_model;
    public static String gpt_preference_page_group_model_advanced;
    public static String gpt_preference_page_combo_engine;
    public static String gpt_preference_page_text_temperature;
    public static String gpt_preference_page_text_max_tokens;
    public static String gpt_preference_page_text_max_tables;

    public static String gpt_dialog_title;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, GPTMessages.class);
    }

    private GPTMessages() {
    }
}