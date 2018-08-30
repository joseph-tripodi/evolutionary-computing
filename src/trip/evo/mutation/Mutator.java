package trip.evo.mutation;

import java.util.Random;

/**
 * Provides static mutator methods
 */
public class Mutator {
    public static Random random = new Random(System.nanoTime());
    /**
     * Mutates a binary string genome
     * @param genome genome representation as a string
     * @param pm mutation probability
     * @return returns mutated genome
     */
    public static String binaryBitFlip(String genome, double pm){
        StringBuilder mutatedGenome = new StringBuilder();
        double r = random.nextDouble();

        // Loop through each character (gene) and flip if r <= pm
        for(char gene : genome.toCharArray()){
            if(r <= pm){
                switch (gene){
                    case '1':
                        mutatedGenome.append('0');
                        break;
                    case '0':
                        mutatedGenome.append('1');
                }
            } else {
                mutatedGenome.append(gene);
            }
        }
        return mutatedGenome.toString();
    }
}
