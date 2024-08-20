@echo off
color 
TITLE Bienvenid@ Integra ACH
MODE con:cols=80 lines=40

:inicio
set var=0
cls
echo =================================================================================
echo                                  BIENVENIDO
echo                                 ACH TEST CASE
echo                           %DATE% ^| %TIME%
echo.
echo =================================================================================

echo  1    Ejecutar login exitoso
echo  2    Ejecutar login fallido por credenciales incorrectas
echo  3    Ejecutar login fallido por usuario bloqueado
echo  4    Ejecutar login fallido por usuario no registrado
echo  5    Ejecutar todos los casos de prueba
echo  6    Salir
echo ---------------------------------------------------------------------------------
echo.

SET /p var= ^> Seleccione una opcion [1-6]:

if "%var%"=="0"   goto inicio
if "%var%"=="1"   goto op1
if "%var%"=="2"   goto op2
if "%var%"=="3"   goto op3
if "%var%"=="4"   goto op4
if "%var%"=="5"   goto op5
if "%var%"=="6"  goto salir

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
      gradle clean test --tests *com.integra.ach.runners.LoginExitosoRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op2
    echo.
    echo. Has elegido la opcion No. 2
    echo.
      gradle clean test --tests *com.integra.ach.runners.LoginFallidoCredencialesRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op3
    echo.
    echo. Has elegido la opcion No. 3
    echo.
      gradle clean test --tests *com.integra.ach.runners.LoginRecuperarContraseñaRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op4
    echo.
    echo. Has elegido la opcion No. 4
    echo.
      gradle clean test --tests *com.integra.ach.runners.LoginFallidoUsuarioNoRegistradoRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op5
    echo.
    echo. Has elegido la opcion No. 5
    echo.
      gradle clean test --tests *com.integra.ach.runners.LoginTodosLosCasosRunner aggregate & cd target/site/serenity & index.html
      
    echo.
    pause
    goto:inicio

:op6
   :salir
    @cls&exit