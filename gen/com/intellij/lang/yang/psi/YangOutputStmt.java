// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangOutputStmt extends YangStatement {

  @NotNull
  List<YangStatement> getStatementList();

  @NotNull
  List<YangStmtsep> getStmtsepList();

  @NotNull
  PsiElement getLeftBrace();

  @NotNull
  PsiElement getOutputKeyword();

  @NotNull
  PsiElement getRightBrace();

}
