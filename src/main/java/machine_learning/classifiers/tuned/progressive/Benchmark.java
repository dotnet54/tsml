package machine_learning.classifiers.tuned.progressive;

import evaluation.storage.ClassifierResults;
import weka.classifiers.Classifier;

public class Benchmark {
    private ClassifierResults results;
    private Classifier classifier;
    private final int id;

    public Benchmark(int id) {
        this.id = id;
    }

    public Benchmark(Classifier classifier, ClassifierResults results, int id) {
        this.id = id;
        setClassifier(classifier);
        setResults(results);
    }

    public ClassifierResults getResults() {
        return results;
    }

    public void setResults(ClassifierResults results) {
        this.results = results;
    }

    public Classifier getClassifier() {
        return classifier;
    }

    public void setClassifier(Classifier classifier) {
        this.classifier = classifier;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Benchmark)) {
            return false;
        }
        return o.hashCode() == hashCode();
    }
}