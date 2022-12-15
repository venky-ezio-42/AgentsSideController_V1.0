package com.venkyezio42.Agents;

import org.springframework.stereotype.Service;

@Service
public class Attacker implements iSide{

    @Override
    public String mission() {
        int commit1 = 0;
        int commit2 = 0;
        return "Oh no. :(";

    }
}
