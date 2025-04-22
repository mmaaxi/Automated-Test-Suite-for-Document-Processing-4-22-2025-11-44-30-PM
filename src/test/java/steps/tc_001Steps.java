package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigate_to_document_upload_page();
    }

    @When("el usuario selecciona la opción 'cargar documentos'")
    public void el_usuario_selecciona_la_opción_cargar_documentos() {
        page.select_upload_option();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opción_para_carga_única_y_carga_múltiple() {
        Assert.assertTrue(page.is_single_and_multiple_upload_options_displayed());
    }

    @When("el usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.select_single_file_upload_option();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_único_recuadro_para_subir_el_archivo() {
        Assert.assertTrue(page.is_single_upload_box_displayed());
    }

    @When("el usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.select_multiple_file_upload_option();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_múltiples_recuadros_correspondientes_a_cada_documento_requerido() {
        Assert.assertTrue(page.is_multiple_upload_boxes_displayed());
    }
}