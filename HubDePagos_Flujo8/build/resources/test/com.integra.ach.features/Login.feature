@PruebasLogin
Feature: Pruebas Login
  @CPLA001
  Scenario Outline: CPLA001 Login Exitoso
    Given Ingresar al portal
    When Login exitoso <tipoDeEntidad> <usuario> <clave>
    Then Valido login exitoso

    Examples:
      | tipoDeEntidad | usuario                                | clave          |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL001
|"EF"|"useradminapprover1@gmail.com"|"Ach.2022*$AU"|

  @CPLA002
  Scenario Outline: CPLA002 Login Fallido Credenciales Incorrectas
    Given Ingresar al portal
    When Login fallido con credenciales incorrectas <tipoDeEntidad> <usuario> <clave>
    Then Valido login fallido con credenciales incorrectas

    Examples:
      | tipoDeEntidad | usuario                                | clave          |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL002
|"EF"|"adminapproverfo@achcolombia.com.co"|"Colombia@13581"|
  
  @CPLA003
  Scenario Outline: CPLA003 Restablecer Contraseña
    Given Ingresar al portal
    When Recuperar contraseña <IdUsuario> <IdCorreo>
    Then Envia correo de la OTP

    Examples:
      | IdUsuario | IdCorreo                                |
    ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@CPL003
|"useradminappaut2@gufum.com"|"useradminappaut2@gufum.com"|


