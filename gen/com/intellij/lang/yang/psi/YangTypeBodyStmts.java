// This is a generated file. Not intended for manual editing.
package com.intellij.lang.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangTypeBodyStmts extends YangCompositeElement {

  @Nullable
  YangBitsSpecification getBitsSpecification();

  @Nullable
  YangDecimal64Specification getDecimal64Specification();

  @Nullable
  YangEnumSpecification getEnumSpecification();

  @Nullable
  YangIdentityrefSpecification getIdentityrefSpecification();

  @Nullable
  YangInstanceIdentifierSpecification getInstanceIdentifierSpecification();

  @Nullable
  YangLeafrefSpecification getLeafrefSpecification();

  @Nullable
  YangNumericalRestrictions getNumericalRestrictions();

  @Nullable
  YangStringRestrictions getStringRestrictions();

  @Nullable
  YangUnionSpecification getUnionSpecification();

}
