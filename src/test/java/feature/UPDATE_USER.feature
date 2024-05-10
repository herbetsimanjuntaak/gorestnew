Feature: Test Automation Update User GOREST


  Scenario: Test Update data user
    Given prepare url for "GET_LIST_USER_BY_ID"
    And prepare update id 6892089
#    And hit API update user by id
#    Then validation status code is equals 200
#    Then validation response json with JSONSchema "get_user_by_id.json"

  Scenario: Test get data user by id
    Given prepare url for "GET_LIST_USER_BY_ID"
    And prepare valid id 6892089
    And hit API get user by id
    Then validation status code is equals 200
    Then validation response body get user by id
    Then validation response json with JSONSchema "get_user_by_id.json"
    And hit API update user by id