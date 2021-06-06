module machine_learning_project {
    exports com.jalasoft.machine_learning;
    exports com.jalasoft.machine_learning.exception;
    requires org.apache.commons.io;
    requires ai.djl.api;
    requires ai.djl.mxnet_engine;
    requires ai.djl.mxnet_model_zoo;
}
