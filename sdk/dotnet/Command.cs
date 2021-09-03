// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Command
{
    [CommandResourceType("command:index:Command")]
    public partial class Command : Pulumi.CustomResource
    {
        [Output("create")]
        public Output<string?> Create { get; private set; } = null!;

        [Output("delete")]
        public Output<string?> Delete { get; private set; } = null!;

        [Output("dir")]
        public Output<string?> Dir { get; private set; } = null!;

        [Output("environment")]
        public Output<ImmutableDictionary<string, string>?> Environment { get; private set; } = null!;

        [Output("interpreter")]
        public Output<ImmutableArray<string>> Interpreter { get; private set; } = null!;

        [Output("stderr")]
        public Output<string> Stderr { get; private set; } = null!;

        [Output("stdout")]
        public Output<string> Stdout { get; private set; } = null!;

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
            : base("command:index:Command", name, args ?? new CommandArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Command(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("command:index:Command", name, null, MakeResourceOptions(options, id))
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

    public sealed class CommandArgs : Pulumi.ResourceArgs
    {
        [Input("create")]
        public Input<string>? Create { get; set; }

        [Input("delete")]
        public Input<string>? Delete { get; set; }

        [Input("dir")]
        public Input<string>? Dir { get; set; }

        [Input("environment")]
        private InputMap<string>? _environment;
        public InputMap<string> Environment
        {
            get => _environment ?? (_environment = new InputMap<string>());
            set => _environment = value;
        }

        [Input("interpreter")]
        private InputList<string>? _interpreter;
        public InputList<string> Interpreter
        {
            get => _interpreter ?? (_interpreter = new InputList<string>());
            set => _interpreter = value;
        }

        [Input("update")]
        public Input<string>? Update { get; set; }

        public CommandArgs()
        {
        }
    }
}
