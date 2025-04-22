Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir y previsualizar un archivo PDF/DOCX dentro del límite de tamaño
    Given I am on the file upload page
    When I select a "valid_document.pdf" file within the size limit
    Then the file is uploaded successfully
    And I can see a preview showing the file name, size, and type