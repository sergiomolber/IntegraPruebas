@echo off
color 
TITLE Bienvenid@ Integra ACH
MODE con:cols=80 lines=30

:inicio
set var=0
cls
echo ================================================================================
echo                                     BIENVENIDO
echo                              HUBDEPAGOS_CIERRE DE CICLO
echo                           %DATE% ^| %TIME%
echo.
echo ================================================================================

echo  1    Consulta de cierre de ciclos
echo  2    Cierre de ciclo exitoso
echo  3    Ejecutar Todo 
echo  4    Salir   
   
echo --------------------------------------------------------------------------------
echo.

SET /p var= ^> Seleccione una opcion [1-4]:

if "%var%"=="0"   goto inicio
if "%var%"=="1"   goto op1
if "%var%"=="2"   goto op2
if "%var%"=="3"   goto op3
if "%var%"=="4"   goto salir

::Mensaje de error, validación cuando se selecciona una opción fuera de rango
echo. El numero "%var%" no es una opcion valida, por favor intente de nuevo.
echo.
pause
echo.
goto:inicio

:op1
    echo.
    echo. Has elegido la opcion No. 1
    echo.
      gradle clean test --tests *com.integra.ach.runners.ConsultaDeCierresDeCicloRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op2
    echo.
    echo. Has elegido la opcion No. 2
    echo.
      gradle clean test --tests *com.integra.ach.runners.CierreDeCicloExitosoRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op3
    echo.
    echo. Has elegido la opcion No. 3
    echo.
      gradle clean test --tests *com.integra.ach.runners.CierreDeTodosLosCiclosRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op4
   :salir
    @cls&exit