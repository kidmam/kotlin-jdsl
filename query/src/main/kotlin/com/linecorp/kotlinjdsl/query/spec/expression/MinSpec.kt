package com.linecorp.kotlinjdsl.query.spec.expression

import com.linecorp.kotlinjdsl.query.spec.Froms
import javax.persistence.criteria.*

data class MinSpec<T : Number?>(
    val expression: ExpressionSpec<T>
) : ExpressionSpec<T> {
    override fun toCriteriaExpression(
        froms: Froms,
        query: AbstractQuery<*>,
        criteriaBuilder: CriteriaBuilder
    ): Expression<T> {
        val expression = expression.toCriteriaExpression(froms, query, criteriaBuilder)

        return criteriaBuilder.min(expression)
    }

    override fun toCriteriaExpression(
        froms: Froms,
        query: CriteriaUpdate<*>,
        criteriaBuilder: CriteriaBuilder
    ): Expression<T> {
        val expression = expression.toCriteriaExpression(froms, query, criteriaBuilder)

        return criteriaBuilder.min(expression)
    }

    override fun toCriteriaExpression(
        froms: Froms,
        query: CriteriaDelete<*>,
        criteriaBuilder: CriteriaBuilder
    ): Expression<T> {
        val expression = expression.toCriteriaExpression(froms, query, criteriaBuilder)

        return criteriaBuilder.min(expression)
    }
}
