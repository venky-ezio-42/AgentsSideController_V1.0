package com.venkyezio42.Agents;

import org.springframework.stereotype.Service;

@Service
public class Attacker implements iSide{

    @Override
    public String mission() {
        return "Oh no. :(";
    }
}
