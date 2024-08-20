@SolicitudTiempoExtra
Feature: Prueba solicitud tiempo extra

  @CrearUnaSolicitudTiempoExtra
  Scenario Outline: Crear una solicitud de tiempo extra
    Given Login exitoso1 <tipoDeEntidad> <usuario> <clave>
    When Ingresar a solicitud tiempo extra y diligenciar formulario de creacion <entidad> <minutos> <sancion> <justificacion>  <estado>
    Then Valido mensaje de creacion exitosa
    When Ingresar a solicitud de tiempo extra y edito la informacion <justificacion> <minutos> <sancion> <justificacion>  <estado>
    Then Valido mensaje de edicion exitosa
    When Ingresar a solicitud de tiempo extra busca y eliminar <justificacion>
    Then Valido mensaje de eliminacion exitosa

    Examples:
      | tipoDeEntidad | usuario                              | clave            | entidad               | minutos | sancion | justificacion  | estado   |
    ##@externaldata@./src/test/resources/Data/Data_SolicitudTiempoExtra.xlsx@CrearSolicitudTiempoExtra
|"EF"|"operadorachaut@gmail.com"|"ColombiaAch.2023*"|"RAPPIPAY (BANRAPPI)"|"300"|"SI"|"Probando"|"ACTIVE"|

#  @EditarUnaSolicitudTiempoExtra
#  Scenario Outline: Editar una solicitud de tiempo extra
#    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
#    When Ingresar a solicitud de tiempo extra y edito la informacion <solicitudAEditar> <minutosAEditar> <sancionAEditar> <justificacionAEditar> <fechaSolicitudAEditar> <estadoAEditar> <cicloAEditar>
#    Then Valido mensaje de edicion exitosa
#
#    Examples:
#      | tipoDeEntidad | usuario                              | clave            | solicitudAEditar      | minutosAEditar | sancionAEditar |justificacionAEditar          | fechaSolicitudAEditar | estadoAEditar | cicloAEditar  |
#    ##@externaldata@./src/test/resources/Data/Data_SolicitudTiempoExtra.xlsx@EditarSolicitudTiempoExtra
#|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Pruebas100"|"50"|"SI"|"Pruebas110"|"2023-11-03"|"ACTIVE"|"4"|
#
#  @EliminarUnaSolicitudTiempoExtra
#  Scenario Outline: Eliminar una solicitud de tiempo extra
#    Given Login exitoso <tipoDeEntidad> <usuario> <clave>
#    When Ingresar a solicitud de tiempo extra busca y eliminar <solicitudAEliminar>
#    Then Valido mensaje de eliminacion exitosa
#
#    Examples:
#      | tipoDeEntidad | usuario                              | clave            | solicitudAEliminar    |
#    ##@externaldata@./src/test/resources/Data/Data_SolicitudTiempoExtra.xlsx@EliminarSolicitudTiempoExtra
#|"EF"|"useradminapp@gmail.com"|"Ach.2022*$AU"|"Pruebas110"|
