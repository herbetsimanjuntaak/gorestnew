Feature: Test Automation Delete User GOREST


  Scenario: Test Delete User
    Given prepare url for "DELETE_USERS"
    And prepare valid id 6894125
    And hit get API delete user by id
    Then validation status code is equals 204