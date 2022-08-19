// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Command.Local
{
    /// <summary>
    /// A local command to be executed.
    /// This command can be inserted into the life cycles of other resources using the
    /// `dependsOn` or `parent` resource options. A command is considered to have
    /// failed when it finished with a non-zero exit code. This will fail the CRUD step
    /// of the `Command` resource.
    /// </summary>
    [CommandResourceType("command:local:Command")]
    public partial class Command : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An archive asset containing files found after running the command.
        /// </summary>
        [Output("archive")]
        public Output<Archive?> Archive { get; private set; } = null!;

        /// <summary>
        /// A list of path globs to return as a single archive asset after the command completes.
        /// 
        /// When specifying glob patterns the following rules apply:
        /// - We only include files not directories for assets and archives.
        /// - Path separators are `/` on all platforms - including Windows.
        /// - Patterns starting with `!` are 'exclude' rules.
        /// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
        /// - `*` matches anything except `/`
        /// - `**` matches anything, _including_ `/`
        /// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
        /// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
        /// 
        /// #### Example
        /// 
        /// Given the rules:
        /// ```yaml
        /// - "assets/**"
        /// - "src/**.js"
        /// - "!**secret.*"
        /// ```
        /// 
        /// When evaluating against this folder:
        /// 
        /// ```yaml
        /// - assets/
        ///   - logos/
        ///     - logo.svg
        /// - src/
        ///   - index.js
        ///   - secret.js
        /// ```
        /// 
        /// The following paths will be returned:
        /// 
        /// ```yaml
        /// - assets/logos/logo.svg
        /// - src/index.js
        /// ```
        /// </summary>
        [Output("archivePaths")]
        public Output<ImmutableArray<string>> ArchivePaths { get; private set; } = null!;

        /// <summary>
        /// A list of path globs to read after the command completes.
        /// 
        /// When specifying glob patterns the following rules apply:
        /// - We only include files not directories for assets and archives.
        /// - Path separators are `/` on all platforms - including Windows.
        /// - Patterns starting with `!` are 'exclude' rules.
        /// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
        /// - `*` matches anything except `/`
        /// - `**` matches anything, _including_ `/`
        /// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
        /// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
        /// 
        /// #### Example
        /// 
        /// Given the rules:
        /// ```yaml
        /// - "assets/**"
        /// - "src/**.js"
        /// - "!**secret.*"
        /// ```
        /// 
        /// When evaluating against this folder:
        /// 
        /// ```yaml
        /// - assets/
        ///   - logos/
        ///     - logo.svg
        /// - src/
        ///   - index.js
        ///   - secret.js
        /// ```
        /// 
        /// The following paths will be returned:
        /// 
        /// ```yaml
        /// - assets/logos/logo.svg
        /// - src/index.js
        /// ```
        /// </summary>
        [Output("assetPaths")]
        public Output<ImmutableArray<string>> AssetPaths { get; private set; } = null!;

        /// <summary>
        /// A map of assets found after running the command.
        /// The key is the relative path from the command dir
        /// </summary>
        [Output("assets")]
        public Output<ImmutableDictionary<string, AssetOrArchive>?> Assets { get; private set; } = null!;

        /// <summary>
        /// The command to run on create.
        /// </summary>
        [Output("create")]
        public Output<string?> Create { get; private set; } = null!;

        /// <summary>
        /// The command to run on delete.
        /// </summary>
        [Output("delete")]
        public Output<string?> Delete { get; private set; } = null!;

        /// <summary>
        /// The directory from which to run the command from. If `dir` does not exist, then
        /// `Command` will fail.
        /// </summary>
        [Output("dir")]
        public Output<string?> Dir { get; private set; } = null!;

        /// <summary>
        /// Additional environment variables available to the command's process.
        /// </summary>
        [Output("environment")]
        public Output<ImmutableDictionary<string, string>?> Environment { get; private set; } = null!;

        /// <summary>
        /// The program and arguments to run the command.
        /// On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
        /// </summary>
        [Output("interpreter")]
        public Output<ImmutableArray<string>> Interpreter { get; private set; } = null!;

        /// <summary>
        /// The standard error of the command's process
        /// </summary>
        [Output("stderr")]
        public Output<string> Stderr { get; private set; } = null!;

        /// <summary>
        /// Pass a string to the command's process as standard in
        /// </summary>
        [Output("stdin")]
        public Output<string?> Stdin { get; private set; } = null!;

        /// <summary>
        /// The standard output of the command's process
        /// </summary>
        [Output("stdout")]
        public Output<string> Stdout { get; private set; } = null!;

        /// <summary>
        /// Trigger replacements on changes to this input.
        /// </summary>
        [Output("triggers")]
        public Output<ImmutableArray<object>> Triggers { get; private set; } = null!;

        /// <summary>
        /// The command to run on update, if empty, create will run again.
        /// </summary>
        [Output("update")]
        public Output<string?> Update { get; private set; } = null!;


        /// <summary>
        /// Create a Command resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Command(string name, CommandArgs? args = null, CustomResourceOptions? options = null)
            : base("command:local:Command", name, args ?? new CommandArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Command(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("command:local:Command", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Command resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Command Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new Command(name, id, options);
        }
    }

    public sealed class CommandArgs : global::Pulumi.ResourceArgs
    {
        [Input("archivePaths")]
        private InputList<string>? _archivePaths;

        /// <summary>
        /// A list of path globs to return as a single archive asset after the command completes.
        /// 
        /// When specifying glob patterns the following rules apply:
        /// - We only include files not directories for assets and archives.
        /// - Path separators are `/` on all platforms - including Windows.
        /// - Patterns starting with `!` are 'exclude' rules.
        /// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
        /// - `*` matches anything except `/`
        /// - `**` matches anything, _including_ `/`
        /// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
        /// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
        /// 
        /// #### Example
        /// 
        /// Given the rules:
        /// ```yaml
        /// - "assets/**"
        /// - "src/**.js"
        /// - "!**secret.*"
        /// ```
        /// 
        /// When evaluating against this folder:
        /// 
        /// ```yaml
        /// - assets/
        ///   - logos/
        ///     - logo.svg
        /// - src/
        ///   - index.js
        ///   - secret.js
        /// ```
        /// 
        /// The following paths will be returned:
        /// 
        /// ```yaml
        /// - assets/logos/logo.svg
        /// - src/index.js
        /// ```
        /// </summary>
        public InputList<string> ArchivePaths
        {
            get => _archivePaths ?? (_archivePaths = new InputList<string>());
            set => _archivePaths = value;
        }

        [Input("assetPaths")]
        private InputList<string>? _assetPaths;

        /// <summary>
        /// A list of path globs to read after the command completes.
        /// 
        /// When specifying glob patterns the following rules apply:
        /// - We only include files not directories for assets and archives.
        /// - Path separators are `/` on all platforms - including Windows.
        /// - Patterns starting with `!` are 'exclude' rules.
        /// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
        /// - `*` matches anything except `/`
        /// - `**` matches anything, _including_ `/`
        /// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
        /// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
        /// 
        /// #### Example
        /// 
        /// Given the rules:
        /// ```yaml
        /// - "assets/**"
        /// - "src/**.js"
        /// - "!**secret.*"
        /// ```
        /// 
        /// When evaluating against this folder:
        /// 
        /// ```yaml
        /// - assets/
        ///   - logos/
        ///     - logo.svg
        /// - src/
        ///   - index.js
        ///   - secret.js
        /// ```
        /// 
        /// The following paths will be returned:
        /// 
        /// ```yaml
        /// - assets/logos/logo.svg
        /// - src/index.js
        /// ```
        /// </summary>
        public InputList<string> AssetPaths
        {
            get => _assetPaths ?? (_assetPaths = new InputList<string>());
            set => _assetPaths = value;
        }

        /// <summary>
        /// The command to run on create.
        /// </summary>
        [Input("create")]
        public Input<string>? Create { get; set; }

        /// <summary>
        /// The command to run on delete.
        /// </summary>
        [Input("delete")]
        public Input<string>? Delete { get; set; }

        /// <summary>
        /// The directory from which to run the command from. If `dir` does not exist, then
        /// `Command` will fail.
        /// </summary>
        [Input("dir")]
        public Input<string>? Dir { get; set; }

        [Input("environment")]
        private InputMap<string>? _environment;

        /// <summary>
        /// Additional environment variables available to the command's process.
        /// </summary>
        public InputMap<string> Environment
        {
            get => _environment ?? (_environment = new InputMap<string>());
            set => _environment = value;
        }

        [Input("interpreter")]
        private InputList<string>? _interpreter;

        /// <summary>
        /// The program and arguments to run the command.
        /// On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
        /// </summary>
        public InputList<string> Interpreter
        {
            get => _interpreter ?? (_interpreter = new InputList<string>());
            set => _interpreter = value;
        }

        /// <summary>
        /// Pass a string to the command's process as standard in
        /// </summary>
        [Input("stdin")]
        public Input<string>? Stdin { get; set; }

        [Input("triggers")]
        private InputList<object>? _triggers;

        /// <summary>
        /// Trigger replacements on changes to this input.
        /// </summary>
        public InputList<object> Triggers
        {
            get => _triggers ?? (_triggers = new InputList<object>());
            set => _triggers = value;
        }

        /// <summary>
        /// The command to run on update, if empty, create will run again.
        /// </summary>
        [Input("update")]
        public Input<string>? Update { get; set; }

        public CommandArgs()
        {
        }
        public static new CommandArgs Empty => new CommandArgs();
    }
}
