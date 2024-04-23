// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.command.remote;

import com.pulumi.command.remote.inputs.ConnectionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CopyFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CopyFileArgs Empty = new CopyFileArgs();

    /**
     * The parameters with which to connect to the remote host.
     * 
     */
    @Import(name="connection", required=true)
    private Output<ConnectionArgs> connection;

    /**
     * @return The parameters with which to connect to the remote host.
     * 
     */
    public Output<ConnectionArgs> connection() {
        return this.connection;
    }

    /**
     * The path of the file or directory to be copied.
     * 
     */
    @Import(name="localPath", required=true)
    private Output<String> localPath;

    /**
     * @return The path of the file or directory to be copied.
     * 
     */
    public Output<String> localPath() {
        return this.localPath;
    }

    /**
     * The destination path in the remote host.
     * 
     */
    @Import(name="remotePath", required=true)
    private Output<String> remotePath;

    /**
     * @return The destination path in the remote host.
     * 
     */
    public Output<String> remotePath() {
        return this.remotePath;
    }

    /**
     * Trigger replacements on changes to this input.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<List<Object>> triggers;

    /**
     * @return Trigger replacements on changes to this input.
     * 
     */
    public Optional<Output<List<Object>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private CopyFileArgs() {}

    private CopyFileArgs(CopyFileArgs $) {
        this.connection = $.connection;
        this.localPath = $.localPath;
        this.remotePath = $.remotePath;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CopyFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CopyFileArgs $;

        public Builder() {
            $ = new CopyFileArgs();
        }

        public Builder(CopyFileArgs defaults) {
            $ = new CopyFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connection The parameters with which to connect to the remote host.
         * 
         * @return builder
         * 
         */
        public Builder connection(Output<ConnectionArgs> connection) {
            $.connection = connection;
            return this;
        }

        /**
         * @param connection The parameters with which to connect to the remote host.
         * 
         * @return builder
         * 
         */
        public Builder connection(ConnectionArgs connection) {
            return connection(Output.of(connection));
        }

        /**
         * @param localPath The path of the file or directory to be copied.
         * 
         * @return builder
         * 
         */
        public Builder localPath(Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        /**
         * @param localPath The path of the file or directory to be copied.
         * 
         * @return builder
         * 
         */
        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        /**
         * @param remotePath The destination path in the remote host.
         * 
         * @return builder
         * 
         */
        public Builder remotePath(Output<String> remotePath) {
            $.remotePath = remotePath;
            return this;
        }

        /**
         * @param remotePath The destination path in the remote host.
         * 
         * @return builder
         * 
         */
        public Builder remotePath(String remotePath) {
            return remotePath(Output.of(remotePath));
        }

        /**
         * @param triggers Trigger replacements on changes to this input.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<List<Object>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers Trigger replacements on changes to this input.
         * 
         * @return builder
         * 
         */
        public Builder triggers(List<Object> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param triggers Trigger replacements on changes to this input.
         * 
         * @return builder
         * 
         */
        public Builder triggers(Object... triggers) {
            return triggers(List.of(triggers));
        }

        public CopyFileArgs build() {
            if ($.connection == null) {
                throw new MissingRequiredPropertyException("CopyFileArgs", "connection");
            }
            if ($.localPath == null) {
                throw new MissingRequiredPropertyException("CopyFileArgs", "localPath");
            }
            if ($.remotePath == null) {
                throw new MissingRequiredPropertyException("CopyFileArgs", "remotePath");
            }
            return $;
        }
    }

}
