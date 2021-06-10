module machine_learning_project {
    exports com.jalasoft.machine_learning.exception;
    exports com.jalasoft.machine_learning.object_recognition;
    requires org.apache.commons.io;
    requires ai.djl.api;
    requires ai.djl.mxnet_engine;
    requires ai.djl.mxnet_model_zoo;
}
