package trip.evo.mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryBitFlipString {
    /**
     * Tests that the binaryBitFlip can mutate a string presentation
     * Uses probability 1.0 to ensure we can have an expected result
     * @throws Exception throws if tests fails
     */
    @Test
    public void bitFlipAbleToMutateString() throws Exception {
        String genome = "10101010";
        String expected = "01010101";

        // Mutate with 100% probability, therefore everything should flip
        String mutated = Mutator.binaryBitFlip(genome, 1.0);
        assertEquals(expected, mutated);
    }

}