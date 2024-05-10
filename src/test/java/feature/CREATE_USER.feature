Feature: Test Automation Create User GOREST


  Scenario: Test new user normal
    Given prepare url for "CREATE_NEW_USERS"
    And hit API create new users
    Then validation status code is equal 201
    Then validation response body get create new user
    Then validation response json with JSONSchema  "post_create_new_user_normal.json"
