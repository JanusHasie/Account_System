package za.ac.nwu.ac.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.dto.UserDetailsDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.CreateAccountTypeFlow;

//import java.util.list;

@RestController
@RequestMapping("UserDetails")
public class UserDetailsController {

    private final CreateAccountTypeFlow createAccountTypeFlow;

    @Autowired
    public UserDetailsController(FetchAccountTypeFlow fetchAccountTypeFlow, @Qualifier("CreateAccountTypeFlowName") CreateAccountTypeFlow createAccountTypeFlow) {
        this.createAccountTypeFlow = createAccountTypeFlow;
    }

    @GetMapping("/ping")
    @ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
        @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response
        = GeneralResponse.class)})
        public ResponseEntity<String> ping(@RequestParam(value = "value that will be echoed", defaultValue = "pong")
        String echo){
         return new ResponseEntity<>(echo, HttpStatus.OK);
        }

    @PostMapping("")
    @ApiOperation(value = "Creates a new user.", notes = "Creates a new UserDetails in DB.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "User details captured successfully", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<UserDetailsDto>> create(
            @ApiParam(value = "Type in UserID number",
                    example = "0",
                    name = "M",
                    required = true)
            @PathVariable("0") final String ID) {

//            @RequestBody AccountType ACCOUNTTYPE){
        GeneralResponse<AccountTypeDto> response = new GeneralResponse<>(true, TYPEOFACCOUNT);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
