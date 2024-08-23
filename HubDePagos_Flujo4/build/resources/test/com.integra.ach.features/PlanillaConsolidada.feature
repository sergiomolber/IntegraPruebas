@PlanillaConsolidada
Feature: Prueba planilla consolidada

  @ConsultarPorFechaYCicloPlanillaConsolidada
  Scenario Outline: Consultar por fecha y ciclo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla consolidada y diligenciar formulario de consulta <fecha> <ciclo>
    Then Valido la consulta

    Examples:
      | tipoDeEntidad | usuario      | clave | fecha   | ciclo |
    ##@externaldata@./src/test/resources/Data/Data_PlanillaConsolidada.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2023-03-11"|"1"|


  @ValidacionDeMontosPlanillaConsolidada
  Scenario Outline: validacion de monto a favor y monto en contra de un banco
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla consolidada y diligenciar formulario de consulta <fecha> <ciclo> <entidad>
    Then Valido el monto a favor y el monto en contra

    Examples:
      | tipoDeEntidad | usuario      | clave | fecha   | ciclo |entidad|
    ##@externaldata@./src/test/resources/Data/Data_PlanillaConsolidada.xlsx@ValidacionDeMontos
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2023-03-11"|"1"|"CITIBANK"|
