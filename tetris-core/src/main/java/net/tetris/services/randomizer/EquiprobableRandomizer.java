package net.tetris.services.randomizer;

import java.util.Random;

/**
 * User: oleksandr.baglai
 * Date: 9/25/12
 * Time: 10:36 AM
 */
public class EquiprobableRandomizer implements Randomizer {

    private Random random = new Random();

    @Override
    public int getNextNumber(int count) {
        return random.nextInt(count);
    }
}
