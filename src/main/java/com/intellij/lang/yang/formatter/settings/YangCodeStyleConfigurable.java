/*
 * Copyright 2013-2015 Sergey Ignatov, Alexander Zolotov, Florin Patan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.lang.yang.formatter.settings;

import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.lang.yang.YangLanguage;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.jetbrains.annotations.NotNull;

public class YangCodeStyleConfigurable extends CodeStyleAbstractConfigurable {
  public YangCodeStyleConfigurable(@NotNull CodeStyleSettings settings, CodeStyleSettings cloneSettings) {
    super(settings, cloneSettings, YangLanguage.INSTANCE.getDisplayName());
  }

  @NotNull
  @Override
  protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
    return new YangCodeStyleMainPanel(getCurrentSettings(), settings);
  }

  @Override
  public String getHelpTopic() {
    return null;
  }

  private static class YangCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
    private YangCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings) {
      super(YangLanguage.INSTANCE, currentSettings, settings);
    }

    @Override
    protected void initTabs(CodeStyleSettings settings) {
      addIndentOptionsTab(settings);
    }
  }
}