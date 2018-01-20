package com.jjhellberg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logic {

    private List<Integer> getInput(String path) {
        List<Integer> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(Integer.parseInt(line));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public int getStepCount(String path) {
        List<Integer> instructions = getInput(path);
        int jumps = 0;
        int current = 0;
        int offset = 0;

        while (current < instructions.size() && current >= 0) {
            jumps++;
            offset = instructions.get(current);
            instructions.set(current, offset + 1);
            current = current + offset;
        }
        return jumps;
    }

    public int getStepCount2(String path) {
        List<Integer> instructions = getInput(path);
        int jumps = 0;
        int current = 0;
        int offset = 0;

        while (current < instructions.size() && current >= 0) {
            jumps++;
            offset = instructions.get(current);
            if (offset < 3) {
                instructions.set(current, offset + 1);
            } else {
                instructions.set(current, offset - 1);
            }
            current = current + offset;
        }
        return jumps;
    }

}
