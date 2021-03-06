// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangSubmoduleStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  YangIdentifierArg getIdentifierArg();

  @NotNull
  List<YangStmtsep> getStmtsepList();

  @NotNull
  YangSubmoduleHeaderStmts getSubmoduleHeaderStmts();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getRightBrace();

  @NotNull
  PsiElement getSubmoduleKeyword();

}
