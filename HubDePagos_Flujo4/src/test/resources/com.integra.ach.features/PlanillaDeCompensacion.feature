@PlanillaDeCompensacion
Feature: Prueba planilla de compensacion

  @ConsultarPorFechaYCiclo
  Scenario Outline: Consultar por fecha y ciclo
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla de compensacion y diligenciar formulario de consulta <fecha> <ciclo> <entidad>
    Then Valido la consulta

    Examples:
      | tipoDeEntidad | usuario      | clave | fecha   | ciclo | entidad |
    ##@externaldata@./src/test/resources/Data/Data_PlanillaDeCompensacion.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2023-11-03"|"1"|"CITIBANK"|

  @ValidacionCampoReversiones
  Scenario Outline: Validacion campo reversion
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla de compensacion y diligenciar formulario de consulta <fecha> <ciclo> <entidad>
    Then Valido la existencia del campo reversiones

    Examples:
      | tipoDeEntidad | usuario                              | clave            | fecha       | ciclo | entidad |
    ##@externaldata@./src/test/resources/Data/Data_PlanillaDeCompensacion.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2023-11-03"|"1"|"CITIBANK"|

  @ValidacionCampoDePagoComisiones
  Scenario Outline: Validacion campo de pago comisiones
    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a planilla de compensacion y diligenciar formulario de consulta <fecha> <ciclo> <entidad>
    Then Valido la existencia del campo pago comisiones

    Examples:
      | tipoDeEntidad | usuario                              | clave            | fecha       | ciclo | entidad |
    ##@externaldata@./src/test/resources/Data/Data_PlanillaDeCompensacion.xlsx@ConsultarPorFechaYCiclo
|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"2023-11-03"|"1"|"CITIBANK"|
