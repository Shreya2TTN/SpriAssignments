package com.example.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {
    @GetMapping("/v1/user")
    public PersonV1 getFirstVersionOfUser()
    {
        return new PersonV1(25,"Shruti Jain");
    }

    @GetMapping("v2/user")
    public PersonV2 getSecondVersionofUser()
    {
        return new PersonV2(new Name("Shruti","Jain"),47,21);
    }

    @GetMapping(value = "/user",params = "version=1")
    public PersonV1 getFirstVersionOfUserUsingRequestParameters()
    {
        return new PersonV1(25,"Shruti Jain");
    }

    @GetMapping(value = "/user",params = "version=2")
    public PersonV2 getSecondVersionOfUserUsingRequestParameters()
    {
        return new PersonV2(new Name("Shruti","Jain"),47,21);
    }

    @GetMapping(value = "/user/header",headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfUserUsingRequestHeader()
    {
        return new PersonV1(25,"Shruti Jain");
    }

    @GetMapping(value = "/user/header",headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfUserUsingRequestHeader()
    {
        return new PersonV2(new Name("Shruti","Jain"),47,21);
    }


    @GetMapping(value = "/user/accept",produces ="application/user.app-v1+json" )

    public PersonV1 getFirstVersionOfUserUsingAcceptHeader()
    {
        return new PersonV1(25,"Shruti Jain");
    }


    @GetMapping(value = "/user/accept",produces = "application/user.app-v2+json")
    public PersonV2 getSecondVersionOfUserUsingAcceptHeader()
    {
        return new PersonV2(new Name("Shruti","Jain"),47,21);
    }

}
