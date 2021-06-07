package com.jalasoft.project.model.algorithm.vgg16.detectors;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * Generic interface for interacting with different recognition engines.
 */
public interface Classifier {
    /**
     * An immutable result returned by a Classifier describing what was recognized.
     */
    public class Recognition {
        /**
         * A unique identifier for what has been recognized. Specific to the class, not the instance of
         * the object.
         */
        private final String id;

        /**
         * Display name for the recognition.
         */
        private final String title;

        private final String Name;

        /**
         * A sortable score for how good the recognition is relative to others. Higher should be better.
         */
        private final Float confidence;

        /** Optional location within the source image for the location of the recognized object. */

        public Recognition(
                final String id, final String title, final String name, final Float confidence) {
            this.id = id;
            this.title = title;
            this.Name = name;
            this.confidence = confidence;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getName() {
            return Name;
        }

        public Float getConfidence() {
            return confidence;
        }


        @Override
        public String toString() {
            String resultString = "";
            if (id != null) {
                resultString += "[" + id + "] ";
            }

            if (title != null) {
                resultString += title + " ";
            }

            if (confidence != null) {
                resultString += String.format("(%.1f%%) ", confidence * 100.0f);
            }

            return resultString.trim();
        }
    }

    List<Recognition> recognizeImage(BufferedImage image);
}