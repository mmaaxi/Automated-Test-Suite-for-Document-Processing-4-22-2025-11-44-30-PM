Feature: Validate generation of 'Slip de salida' and storage in history

  Scenario: Complete the upload and processing of documents
    Given the user is on the document upload page
    When the user uploads necessary documents
    And the user initiates the document processing
    Then the system should generate the 'Slip de salida'
    And the system should save original documents in request history
    And the system should save extracted data in request history