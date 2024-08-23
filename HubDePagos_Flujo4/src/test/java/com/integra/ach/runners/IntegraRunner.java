package com.integra.ach.runners;

import com.integra.ach.utils.BeforeSuite;
import com.integra.ach.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import java.io.IOException;

@RunWith(IntegraRunner.class)
@Suite.SuiteClasses({})
public class IntegraRunner extends Suite {

    public IntegraRunner(Class<?> klass, RunnerBuilder builder) throws InitializationError {
        super(klass, builder);
    }

    // Este Runner realiza el proceso de subir un archivo específico.
    // Al momento de subir, realiza la aprobación del archivo y, posteriormente,
    // efectúa el cierre del ciclo.
    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@SubirArchivoExitoso or @ConsultaDeCierresDeCiclo or @CierreDeCicloExitoso"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class SubirArchivoExitosoRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@ConsultarPorFechaYCicloCuadreYConciliacion,@ValidacionDeMontosCuadreYConciliacion"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class EjecucionCompletaRunner {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }

    }

    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@ConsultarPorFechaYCicloPlanillaConsolidada"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class EjecucionCompletaRunner2 {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }

    @RunWith(RunnerPersonalizado.class)
    @CucumberOptions(
            features = "src/test/resources/com.integra.ach.features",
            tags = {"@ConsultarPorFechaYCiclo,@ValidacionCampoReversiones,@ValidacionCampoDePagoComisiones"},
            glue = "com.integra.ach.stepDefinitions",
            snippets = SnippetType.CAMELCASE
    )
    public static class EjecucionCompletaRunner3 {
        @BeforeSuite
        public static void test() throws InvalidFormatException, IOException {
            DataToFeature.overrideFeatureFiles("./src/test/resources/com.integra.ach.features");
        }
    }
}







