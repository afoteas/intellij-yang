/*
 * Copyright 2014 Red Hat, Inc.
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

package com.intellij.lang.yang.psi;

import com.intellij.lang.yang.YangLanguage;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

public interface YangTokenTypeSets {
    IFileElementType YANG_FILE = new IFileElementType("YANGFILE", YangLanguage.INSTANCE);

    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
    TokenSet STRINGS = TokenSet.create(YangTypes.YANG_DOUBLE_QUOTED_STRING, YangTypes.YANG_SINGLE_QUOTED_STRING, YangTypes.YANG_IDENTIFIER);
    IElementType LINE_COMMENT = new YangElementType("YANG_LINE_COMMENT");
    IElementType BLOCK_COMMENT = new YangElementType("YANG_BLOCK_COMMENT");
 }