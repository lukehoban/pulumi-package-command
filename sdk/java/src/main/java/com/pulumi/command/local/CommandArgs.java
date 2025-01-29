// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.command.local;

import com.pulumi.command.local.enums.Logging;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CommandArgs extends com.pulumi.resources.ResourceArgs {

    public static final CommandArgs Empty = new CommandArgs();

    /**
     * If the previous command&#39;s stdout and stderr (as generated by the prior create/update) is
     * injected into the environment of the next run as PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR.
     * Defaults to true.
     * 
     */
    @Import(name="addPreviousOutputInEnv")
    private @Nullable Output<Boolean> addPreviousOutputInEnv;

    /**
     * @return If the previous command&#39;s stdout and stderr (as generated by the prior create/update) is
     * injected into the environment of the next run as PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR.
     * Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> addPreviousOutputInEnv() {
        return Optional.ofNullable(this.addPreviousOutputInEnv);
    }

    /**
     * A list of path globs to return as a single archive asset after the command completes.
     * 
     * When specifying glob patterns the following rules apply:
     * - We only include files not directories for assets and archives.
     * - Path separators are `/` on all platforms - including Windows.
     * - Patterns starting with `!` are &#39;exclude&#39; rules.
     * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
     * - `*` matches anything except `/`
     * - `**` matches anything, _including_ `/`
     * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
     * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
     * 
     * #### Example
     * 
     * Given the rules:
     * 
     * When evaluating against this folder:
     * 
     * The following paths will be returned:
     * 
     */
    @Import(name="archivePaths")
    private @Nullable Output<List<String>> archivePaths;

    /**
     * @return A list of path globs to return as a single archive asset after the command completes.
     * 
     * When specifying glob patterns the following rules apply:
     * - We only include files not directories for assets and archives.
     * - Path separators are `/` on all platforms - including Windows.
     * - Patterns starting with `!` are &#39;exclude&#39; rules.
     * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
     * - `*` matches anything except `/`
     * - `**` matches anything, _including_ `/`
     * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
     * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
     * 
     * #### Example
     * 
     * Given the rules:
     * 
     * When evaluating against this folder:
     * 
     * The following paths will be returned:
     * 
     */
    public Optional<Output<List<String>>> archivePaths() {
        return Optional.ofNullable(this.archivePaths);
    }

    /**
     * A list of path globs to read after the command completes.
     * 
     * When specifying glob patterns the following rules apply:
     * - We only include files not directories for assets and archives.
     * - Path separators are `/` on all platforms - including Windows.
     * - Patterns starting with `!` are &#39;exclude&#39; rules.
     * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
     * - `*` matches anything except `/`
     * - `**` matches anything, _including_ `/`
     * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
     * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
     * 
     * #### Example
     * 
     * Given the rules:
     * 
     * When evaluating against this folder:
     * 
     * The following paths will be returned:
     * 
     */
    @Import(name="assetPaths")
    private @Nullable Output<List<String>> assetPaths;

    /**
     * @return A list of path globs to read after the command completes.
     * 
     * When specifying glob patterns the following rules apply:
     * - We only include files not directories for assets and archives.
     * - Path separators are `/` on all platforms - including Windows.
     * - Patterns starting with `!` are &#39;exclude&#39; rules.
     * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
     * - `*` matches anything except `/`
     * - `**` matches anything, _including_ `/`
     * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
     * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
     * 
     * #### Example
     * 
     * Given the rules:
     * 
     * When evaluating against this folder:
     * 
     * The following paths will be returned:
     * 
     */
    public Optional<Output<List<String>>> assetPaths() {
        return Optional.ofNullable(this.assetPaths);
    }

    /**
     * The command to run on create.
     * 
     */
    @Import(name="create")
    private @Nullable Output<String> create;

    /**
     * @return The command to run on create.
     * 
     */
    public Optional<Output<String>> create() {
        return Optional.ofNullable(this.create);
    }

    /**
     * The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
     * and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
     * Command resource from previous create or update steps.
     * 
     */
    @Import(name="delete")
    private @Nullable Output<String> delete;

    /**
     * @return The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
     * and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
     * Command resource from previous create or update steps.
     * 
     */
    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * The directory from which to run the command from. If `dir` does not exist, then
     * `Command` will fail.
     * 
     */
    @Import(name="dir")
    private @Nullable Output<String> dir;

    /**
     * @return The directory from which to run the command from. If `dir` does not exist, then
     * `Command` will fail.
     * 
     */
    public Optional<Output<String>> dir() {
        return Optional.ofNullable(this.dir);
    }

    /**
     * Additional environment variables available to the command&#39;s process.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<Map<String,String>> environment;

    /**
     * @return Additional environment variables available to the command&#39;s process.
     * 
     */
    public Optional<Output<Map<String,String>>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The program and arguments to run the command.
     * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
     * 
     */
    @Import(name="interpreter")
    private @Nullable Output<List<String>> interpreter;

    /**
     * @return The program and arguments to run the command.
     * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
     * 
     */
    public Optional<Output<List<String>>> interpreter() {
        return Optional.ofNullable(this.interpreter);
    }

    /**
     * If the command&#39;s stdout and stderr should be logged. This doesn&#39;t affect the capturing of
     * stdout and stderr as outputs. If there might be secrets in the output, you can disable logging here and mark the
     * outputs as secret via &#39;additionalSecretOutputs&#39;. Defaults to logging both stdout and stderr.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<Logging> logging;

    /**
     * @return If the command&#39;s stdout and stderr should be logged. This doesn&#39;t affect the capturing of
     * stdout and stderr as outputs. If there might be secrets in the output, you can disable logging here and mark the
     * outputs as secret via &#39;additionalSecretOutputs&#39;. Defaults to logging both stdout and stderr.
     * 
     */
    public Optional<Output<Logging>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * Pass a string to the command&#39;s process as standard in
     * 
     */
    @Import(name="stdin")
    private @Nullable Output<String> stdin;

    /**
     * @return Pass a string to the command&#39;s process as standard in
     * 
     */
    public Optional<Output<String>> stdin() {
        return Optional.ofNullable(this.stdin);
    }

    /**
     * Trigger a resource replacement on changes to any of these values. The
     * trigger values can be of any type. If a value is different in the current update compared to the
     * previous update, the resource will be replaced, i.e., the &#34;create&#34; command will be re-run.
     * Please see the resource documentation for examples.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<List<Object>> triggers;

    /**
     * @return Trigger a resource replacement on changes to any of these values. The
     * trigger values can be of any type. If a value is different in the current update compared to the
     * previous update, the resource will be replaced, i.e., the &#34;create&#34; command will be re-run.
     * Please see the resource documentation for examples.
     * 
     */
    public Optional<Output<List<Object>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    /**
     * The command to run on update, if empty, create will
     * run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
     * are set to the stdout and stderr properties of the Command resource from previous
     * create or update steps.
     * 
     */
    @Import(name="update")
    private @Nullable Output<String> update;

    /**
     * @return The command to run on update, if empty, create will
     * run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
     * are set to the stdout and stderr properties of the Command resource from previous
     * create or update steps.
     * 
     */
    public Optional<Output<String>> update() {
        return Optional.ofNullable(this.update);
    }

    private CommandArgs() {}

    private CommandArgs(CommandArgs $) {
        this.addPreviousOutputInEnv = $.addPreviousOutputInEnv;
        this.archivePaths = $.archivePaths;
        this.assetPaths = $.assetPaths;
        this.create = $.create;
        this.delete = $.delete;
        this.dir = $.dir;
        this.environment = $.environment;
        this.interpreter = $.interpreter;
        this.logging = $.logging;
        this.stdin = $.stdin;
        this.triggers = $.triggers;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CommandArgs $;

        public Builder() {
            $ = new CommandArgs();
        }

        public Builder(CommandArgs defaults) {
            $ = new CommandArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addPreviousOutputInEnv If the previous command&#39;s stdout and stderr (as generated by the prior create/update) is
         * injected into the environment of the next run as PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR.
         * Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder addPreviousOutputInEnv(@Nullable Output<Boolean> addPreviousOutputInEnv) {
            $.addPreviousOutputInEnv = addPreviousOutputInEnv;
            return this;
        }

        /**
         * @param addPreviousOutputInEnv If the previous command&#39;s stdout and stderr (as generated by the prior create/update) is
         * injected into the environment of the next run as PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR.
         * Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder addPreviousOutputInEnv(Boolean addPreviousOutputInEnv) {
            return addPreviousOutputInEnv(Output.of(addPreviousOutputInEnv));
        }

        /**
         * @param archivePaths A list of path globs to return as a single archive asset after the command completes.
         * 
         * When specifying glob patterns the following rules apply:
         * - We only include files not directories for assets and archives.
         * - Path separators are `/` on all platforms - including Windows.
         * - Patterns starting with `!` are &#39;exclude&#39; rules.
         * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
         * - `*` matches anything except `/`
         * - `**` matches anything, _including_ `/`
         * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
         * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
         * 
         * #### Example
         * 
         * Given the rules:
         * 
         * When evaluating against this folder:
         * 
         * The following paths will be returned:
         * 
         * @return builder
         * 
         */
        public Builder archivePaths(@Nullable Output<List<String>> archivePaths) {
            $.archivePaths = archivePaths;
            return this;
        }

        /**
         * @param archivePaths A list of path globs to return as a single archive asset after the command completes.
         * 
         * When specifying glob patterns the following rules apply:
         * - We only include files not directories for assets and archives.
         * - Path separators are `/` on all platforms - including Windows.
         * - Patterns starting with `!` are &#39;exclude&#39; rules.
         * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
         * - `*` matches anything except `/`
         * - `**` matches anything, _including_ `/`
         * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
         * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
         * 
         * #### Example
         * 
         * Given the rules:
         * 
         * When evaluating against this folder:
         * 
         * The following paths will be returned:
         * 
         * @return builder
         * 
         */
        public Builder archivePaths(List<String> archivePaths) {
            return archivePaths(Output.of(archivePaths));
        }

        /**
         * @param archivePaths A list of path globs to return as a single archive asset after the command completes.
         * 
         * When specifying glob patterns the following rules apply:
         * - We only include files not directories for assets and archives.
         * - Path separators are `/` on all platforms - including Windows.
         * - Patterns starting with `!` are &#39;exclude&#39; rules.
         * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
         * - `*` matches anything except `/`
         * - `**` matches anything, _including_ `/`
         * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
         * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
         * 
         * #### Example
         * 
         * Given the rules:
         * 
         * When evaluating against this folder:
         * 
         * The following paths will be returned:
         * 
         * @return builder
         * 
         */
        public Builder archivePaths(String... archivePaths) {
            return archivePaths(List.of(archivePaths));
        }

        /**
         * @param assetPaths A list of path globs to read after the command completes.
         * 
         * When specifying glob patterns the following rules apply:
         * - We only include files not directories for assets and archives.
         * - Path separators are `/` on all platforms - including Windows.
         * - Patterns starting with `!` are &#39;exclude&#39; rules.
         * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
         * - `*` matches anything except `/`
         * - `**` matches anything, _including_ `/`
         * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
         * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
         * 
         * #### Example
         * 
         * Given the rules:
         * 
         * When evaluating against this folder:
         * 
         * The following paths will be returned:
         * 
         * @return builder
         * 
         */
        public Builder assetPaths(@Nullable Output<List<String>> assetPaths) {
            $.assetPaths = assetPaths;
            return this;
        }

        /**
         * @param assetPaths A list of path globs to read after the command completes.
         * 
         * When specifying glob patterns the following rules apply:
         * - We only include files not directories for assets and archives.
         * - Path separators are `/` on all platforms - including Windows.
         * - Patterns starting with `!` are &#39;exclude&#39; rules.
         * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
         * - `*` matches anything except `/`
         * - `**` matches anything, _including_ `/`
         * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
         * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
         * 
         * #### Example
         * 
         * Given the rules:
         * 
         * When evaluating against this folder:
         * 
         * The following paths will be returned:
         * 
         * @return builder
         * 
         */
        public Builder assetPaths(List<String> assetPaths) {
            return assetPaths(Output.of(assetPaths));
        }

        /**
         * @param assetPaths A list of path globs to read after the command completes.
         * 
         * When specifying glob patterns the following rules apply:
         * - We only include files not directories for assets and archives.
         * - Path separators are `/` on all platforms - including Windows.
         * - Patterns starting with `!` are &#39;exclude&#39; rules.
         * - Rules are evaluated in order, so exclude rules should be after inclusion rules.
         * - `*` matches anything except `/`
         * - `**` matches anything, _including_ `/`
         * - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
         * - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
         * 
         * #### Example
         * 
         * Given the rules:
         * 
         * When evaluating against this folder:
         * 
         * The following paths will be returned:
         * 
         * @return builder
         * 
         */
        public Builder assetPaths(String... assetPaths) {
            return assetPaths(List.of(assetPaths));
        }

        /**
         * @param create The command to run on create.
         * 
         * @return builder
         * 
         */
        public Builder create(@Nullable Output<String> create) {
            $.create = create;
            return this;
        }

        /**
         * @param create The command to run on create.
         * 
         * @return builder
         * 
         */
        public Builder create(String create) {
            return create(Output.of(create));
        }

        /**
         * @param delete The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
         * and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
         * Command resource from previous create or update steps.
         * 
         * @return builder
         * 
         */
        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        /**
         * @param delete The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
         * and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
         * Command resource from previous create or update steps.
         * 
         * @return builder
         * 
         */
        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        /**
         * @param dir The directory from which to run the command from. If `dir` does not exist, then
         * `Command` will fail.
         * 
         * @return builder
         * 
         */
        public Builder dir(@Nullable Output<String> dir) {
            $.dir = dir;
            return this;
        }

        /**
         * @param dir The directory from which to run the command from. If `dir` does not exist, then
         * `Command` will fail.
         * 
         * @return builder
         * 
         */
        public Builder dir(String dir) {
            return dir(Output.of(dir));
        }

        /**
         * @param environment Additional environment variables available to the command&#39;s process.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<Map<String,String>> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Additional environment variables available to the command&#39;s process.
         * 
         * @return builder
         * 
         */
        public Builder environment(Map<String,String> environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param interpreter The program and arguments to run the command.
         * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
         * 
         * @return builder
         * 
         */
        public Builder interpreter(@Nullable Output<List<String>> interpreter) {
            $.interpreter = interpreter;
            return this;
        }

        /**
         * @param interpreter The program and arguments to run the command.
         * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
         * 
         * @return builder
         * 
         */
        public Builder interpreter(List<String> interpreter) {
            return interpreter(Output.of(interpreter));
        }

        /**
         * @param interpreter The program and arguments to run the command.
         * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
         * 
         * @return builder
         * 
         */
        public Builder interpreter(String... interpreter) {
            return interpreter(List.of(interpreter));
        }

        /**
         * @param logging If the command&#39;s stdout and stderr should be logged. This doesn&#39;t affect the capturing of
         * stdout and stderr as outputs. If there might be secrets in the output, you can disable logging here and mark the
         * outputs as secret via &#39;additionalSecretOutputs&#39;. Defaults to logging both stdout and stderr.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<Logging> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging If the command&#39;s stdout and stderr should be logged. This doesn&#39;t affect the capturing of
         * stdout and stderr as outputs. If there might be secrets in the output, you can disable logging here and mark the
         * outputs as secret via &#39;additionalSecretOutputs&#39;. Defaults to logging both stdout and stderr.
         * 
         * @return builder
         * 
         */
        public Builder logging(Logging logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param stdin Pass a string to the command&#39;s process as standard in
         * 
         * @return builder
         * 
         */
        public Builder stdin(@Nullable Output<String> stdin) {
            $.stdin = stdin;
            return this;
        }

        /**
         * @param stdin Pass a string to the command&#39;s process as standard in
         * 
         * @return builder
         * 
         */
        public Builder stdin(String stdin) {
            return stdin(Output.of(stdin));
        }

        /**
         * @param triggers Trigger a resource replacement on changes to any of these values. The
         * trigger values can be of any type. If a value is different in the current update compared to the
         * previous update, the resource will be replaced, i.e., the &#34;create&#34; command will be re-run.
         * Please see the resource documentation for examples.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<List<Object>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers Trigger a resource replacement on changes to any of these values. The
         * trigger values can be of any type. If a value is different in the current update compared to the
         * previous update, the resource will be replaced, i.e., the &#34;create&#34; command will be re-run.
         * Please see the resource documentation for examples.
         * 
         * @return builder
         * 
         */
        public Builder triggers(List<Object> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param triggers Trigger a resource replacement on changes to any of these values. The
         * trigger values can be of any type. If a value is different in the current update compared to the
         * previous update, the resource will be replaced, i.e., the &#34;create&#34; command will be re-run.
         * Please see the resource documentation for examples.
         * 
         * @return builder
         * 
         */
        public Builder triggers(Object... triggers) {
            return triggers(List.of(triggers));
        }

        /**
         * @param update The command to run on update, if empty, create will
         * run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
         * are set to the stdout and stderr properties of the Command resource from previous
         * create or update steps.
         * 
         * @return builder
         * 
         */
        public Builder update(@Nullable Output<String> update) {
            $.update = update;
            return this;
        }

        /**
         * @param update The command to run on update, if empty, create will
         * run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
         * are set to the stdout and stderr properties of the Command resource from previous
         * create or update steps.
         * 
         * @return builder
         * 
         */
        public Builder update(String update) {
            return update(Output.of(update));
        }

        public CommandArgs build() {
            $.addPreviousOutputInEnv = Codegen.booleanProp("addPreviousOutputInEnv").output().arg($.addPreviousOutputInEnv).def(true).getNullable();
            return $;
        }
    }

}
