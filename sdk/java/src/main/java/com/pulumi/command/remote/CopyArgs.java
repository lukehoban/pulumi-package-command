// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.command.remote;

import com.pulumi.asset.AssetOrArchive;
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


public final class CopyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CopyArgs Empty = new CopyArgs();

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
     * An asset or an archive to upload as the source of the copy. It must be path based.
     * 
     */
    @Import(name="source", required=true)
    private Output<AssetOrArchive> source;

    /**
     * @return An asset or an archive to upload as the source of the copy. It must be path based.
     * 
     */
    public Output<AssetOrArchive> source() {
        return this.source;
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

    private CopyArgs() {}

    private CopyArgs(CopyArgs $) {
        this.connection = $.connection;
        this.remotePath = $.remotePath;
        this.source = $.source;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CopyArgs $;

        public Builder() {
            $ = new CopyArgs();
        }

        public Builder(CopyArgs defaults) {
            $ = new CopyArgs(Objects.requireNonNull(defaults));
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
         * @param source An asset or an archive to upload as the source of the copy. It must be path based.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<AssetOrArchive> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source An asset or an archive to upload as the source of the copy. It must be path based.
         * 
         * @return builder
         * 
         */
        public Builder source(AssetOrArchive source) {
            return source(Output.of(source));
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

        public CopyArgs build() {
            if ($.connection == null) {
                throw new MissingRequiredPropertyException("CopyArgs", "connection");
            }
            if ($.remotePath == null) {
                throw new MissingRequiredPropertyException("CopyArgs", "remotePath");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("CopyArgs", "source");
            }
            return $;
        }
    }

}
