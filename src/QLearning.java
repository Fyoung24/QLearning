import java.util.*;
public class QLearning<QTable> {
    public static void main(String[] args) {
        // Create a new QLearning object
        QLearning qLearning = new QLearning();
        // Run the QLearning algorithm
        qLearning.run();
    }

    public void run() {
        // Create a new QTable object
        QTable qTable = new QTable();
        // Create a new Environment object
        Environment environment = new Environment();
        // Create a new Agent object
        Agent agent = new Agent();
        // Create a new QLearningAlgorithm object
        QLearningAlgorithm qLearningAlgorithm = new QLearningAlgorithm();

        // Set the environment and agent for the QLearningAlgorithm
        qLearningAlgorithm.setEnvironment(environment);
        qLearningAlgorithm.setAgent(agent);
        // Set the QTable for the QLearningAlgorithm
        qLearningAlgorithm.setQTable(qTable);

        // Train the agent
        qLearningAlgorithm.train();
        // Test the agent
        qLearningAlgorithm.test();
    }
}
