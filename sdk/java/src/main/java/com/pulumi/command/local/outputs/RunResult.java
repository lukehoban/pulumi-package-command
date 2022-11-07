// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.command.local.outputs;

import com.pulumi.asset.Archive;
import com.pulumi.asset.AssetOrArchive;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RunResult {
    /**
     * @return An archive asset containing files found after running the command.
     * 
     */
    private @Nullable Archive archive;
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
    private @Nullable List<String> archivePaths;
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
    private @Nullable List<String> assetPaths;
    /**
     * @return A map of assets found after running the command.
     * The key is the relative path from the command dir
     * 
     */
    private @Nullable Map<String,AssetOrArchive> assets;
    private String command;
    /**
     * @return The directory from which to run the command from. If `dir` does not exist, then
     * `Command` will fail.
     * 
     */
    private @Nullable String dir;
    /**
     * @return Additional environment variables available to the command&#39;s process.
     * 
     */
    private @Nullable Map<String,String> environment;
    /**
     * @return The program and arguments to run the command.
     * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
     * 
     */
    private @Nullable List<String> interpreter;
    /**
     * @return The standard error of the command&#39;s process
     * 
     */
    private String stderr;
    /**
     * @return Pass a string to the command&#39;s process as standard in
     * 
     */
    private @Nullable String stdin;
    /**
     * @return The standard output of the command&#39;s process
     * 
     */
    private String stdout;

    private RunResult() {}
    /**
     * @return An archive asset containing files found after running the command.
     * 
     */
    public Optional<Archive> archive() {
        return Optional.ofNullable(this.archive);
    }
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
    public List<String> archivePaths() {
        return this.archivePaths == null ? List.of() : this.archivePaths;
    }
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
    public List<String> assetPaths() {
        return this.assetPaths == null ? List.of() : this.assetPaths;
    }
    /**
     * @return A map of assets found after running the command.
     * The key is the relative path from the command dir
     * 
     */
    public Map<String,AssetOrArchive> assets() {
        return this.assets == null ? Map.of() : this.assets;
    }
    public String command() {
        return this.command;
    }
    /**
     * @return The directory from which to run the command from. If `dir` does not exist, then
     * `Command` will fail.
     * 
     */
    public Optional<String> dir() {
        return Optional.ofNullable(this.dir);
    }
    /**
     * @return Additional environment variables available to the command&#39;s process.
     * 
     */
    public Map<String,String> environment() {
        return this.environment == null ? Map.of() : this.environment;
    }
    /**
     * @return The program and arguments to run the command.
     * On Linux and macOS, defaults to: `[&#34;/bin/sh&#34;, &#34;-c&#34;]`. On Windows, defaults to: `[&#34;cmd&#34;, &#34;/C&#34;]`
     * 
     */
    public List<String> interpreter() {
        return this.interpreter == null ? List.of() : this.interpreter;
    }
    /**
     * @return The standard error of the command&#39;s process
     * 
     */
    public String stderr() {
        return this.stderr;
    }
    /**
     * @return Pass a string to the command&#39;s process as standard in
     * 
     */
    public Optional<String> stdin() {
        return Optional.ofNullable(this.stdin);
    }
    /**
     * @return The standard output of the command&#39;s process
     * 
     */
    public String stdout() {
        return this.stdout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Archive archive;
        private @Nullable List<String> archivePaths;
        private @Nullable List<String> assetPaths;
        private @Nullable Map<String,AssetOrArchive> assets;
        private String command;
        private @Nullable String dir;
        private @Nullable Map<String,String> environment;
        private @Nullable List<String> interpreter;
        private String stderr;
        private @Nullable String stdin;
        private String stdout;
        public Builder() {}
        public Builder(RunResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archive = defaults.archive;
    	      this.archivePaths = defaults.archivePaths;
    	      this.assetPaths = defaults.assetPaths;
    	      this.assets = defaults.assets;
    	      this.command = defaults.command;
    	      this.dir = defaults.dir;
    	      this.environment = defaults.environment;
    	      this.interpreter = defaults.interpreter;
    	      this.stderr = defaults.stderr;
    	      this.stdin = defaults.stdin;
    	      this.stdout = defaults.stdout;
        }

        @CustomType.Setter
        public Builder archive(@Nullable Archive archive) {
            this.archive = archive;
            return this;
        }
        @CustomType.Setter
        public Builder archivePaths(@Nullable List<String> archivePaths) {
            this.archivePaths = archivePaths;
            return this;
        }
        public Builder archivePaths(String... archivePaths) {
            return archivePaths(List.of(archivePaths));
        }
        @CustomType.Setter
        public Builder assetPaths(@Nullable List<String> assetPaths) {
            this.assetPaths = assetPaths;
            return this;
        }
        public Builder assetPaths(String... assetPaths) {
            return assetPaths(List.of(assetPaths));
        }
        @CustomType.Setter
        public Builder assets(@Nullable Map<String,AssetOrArchive> assets) {
            this.assets = assets;
            return this;
        }
        @CustomType.Setter
        public Builder command(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        @CustomType.Setter
        public Builder dir(@Nullable String dir) {
            this.dir = dir;
            return this;
        }
        @CustomType.Setter
        public Builder environment(@Nullable Map<String,String> environment) {
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder interpreter(@Nullable List<String> interpreter) {
            this.interpreter = interpreter;
            return this;
        }
        public Builder interpreter(String... interpreter) {
            return interpreter(List.of(interpreter));
        }
        @CustomType.Setter
        public Builder stderr(String stderr) {
            this.stderr = Objects.requireNonNull(stderr);
            return this;
        }
        @CustomType.Setter
        public Builder stdin(@Nullable String stdin) {
            this.stdin = stdin;
            return this;
        }
        @CustomType.Setter
        public Builder stdout(String stdout) {
            this.stdout = Objects.requireNonNull(stdout);
            return this;
        }
        public RunResult build() {
            final var o = new RunResult();
            o.archive = archive;
            o.archivePaths = archivePaths;
            o.assetPaths = assetPaths;
            o.assets = assets;
            o.command = command;
            o.dir = dir;
            o.environment = environment;
            o.interpreter = interpreter;
            o.stderr = stderr;
            o.stdin = stdin;
            o.stdout = stdout;
            return o;
        }
    }
}
