package com.databricks.labs.validation

import com.databricks.labs.validation.utils.MinMaxFunc
import com.databricks.labs.validation.utils.Structures.{Bounds, ValidNumerics, ValidStrings}
import org.apache.spark.sql.Column

class Rule {

  private var _ruleName: String = _
  private var _column: Column = _
  private var _boundaries: Bounds = _
  private var _validNumerics: ValidNumerics = _
  private var _validStrings: ValidStrings = _
  private var _dateTimeLogic: Column = _
  private var _ruleType: String = _

  private def setRuleName(value: String): this.type = {
    _ruleName = value
    this
  }
  private def setColumn(value: Column): this.type = {
    _column = value
    this
  }
  private def setBoundaries(value: Bounds): this.type = {
    _boundaries = value
    this
  }
  private def setValidNumerics(value: ValidNumerics): this.type = {
    _validNumerics = value
    this
  }
  private def setValidStrings(value: ValidStrings): this.type = {
    _validStrings = value
    this
  }
  private def setDateTimeLogic(value: Column): this.type = {
    _dateTimeLogic = value
    this
  }
  private def setRuleType(value: String): this.type = {
    _ruleType = value
    this
  }

  def ruleName: String = _ruleName
  def inputColumn: Column = _column
  def boundaries: Bounds = _boundaries
  def validNumerics: ValidNumerics = _validNumerics
  def validStrings: ValidStrings = _validStrings
  def dateTimeLogic: Column = _dateTimeLogic
  def ruleType: String = _ruleType

}

object Rule {

  def apply(
           ruleName: String,
           column: Column,
           boundaries: Bounds
           ): Rule = {

    new Rule()
      .setRuleName(ruleName)
      .setColumn(column)
      .setBoundaries(boundaries)
      .setRuleType("bounds")
  }

//  def apply(
//             ruleName: String,
//             column: Column,
//             aggFunc: Option[Column => Column], // TODO -- Handle aggs
//             alias: String,
//             validNumerics: ValidNumerics,
//             by: Column*
//           ): Rule = {
//
//    new Rule()
//      .setRuleName(ruleName)
//      .setColumn(column)
//      .setAggFunc(aggFunc)
//      .setAlias(alias)
//      .setValidNumerics(validNumerics)
//      .setRuleType("validNumerics")
//      .setByCols(by)
//  }
//
//  def apply(
//    ruleName: String,
//    column: Column,
//    aggFunc: Option[Column => Column], // TODO - Handle Aggs
//    alias: String,
//    validStrings: ValidStrings,
//    by: Column*
//  ): Rule = {
//
//    new Rule()
//      .setRuleName(ruleName)
//      .setColumn(column)
//      .setAggFunc(aggFunc)
//      .setAlias(alias)
//      .setValidStrings(validStrings)
//      .setRuleType("validStrings")
//      .setByCols(by)
//  }

//  def apply(
//             ruleName: String,
//             column: Column,
//             aggFunc: Option[Column => Column], // TODO - handle aggs
//             alias: String,
//             dateTimeLogic: Column,
//             by: Column*
//           ): Rule = {
//
//    new Rule()
//      .setRuleName(ruleName)
//      .setColumn(column)
//      .setAggFunc(aggFunc)
//      .setAlias(alias)
//      .setDateTimeLogic(dateTimeLogic)
//      .setRuleType("dateTime")
//      .setByCols(by)
//  }

}
