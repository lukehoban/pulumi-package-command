// *** WARNING: this file was generated by pulumigen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Command.Remote
{
    /// <summary>
    /// Copy a local file to a remote host.
    /// </summary>
    [CommandResourceType("command:remote:CopyFile")]
    public partial class CopyFile : Pulumi.CustomResource
    {
        /// <summary>
        /// The parameters with which to connect to the remote host.
        /// </summary>
        [Output("connection")]
        public Output<Outputs.Connection> Connection { get; private set; } = null!;

        /// <summary>
        /// The path of the file to be copied.
        /// </summary>
        [Output("localPath")]
        public Output<string> LocalPath { get; private set; } = null!;

        /// <summary>
        /// The destination path in the remote host.
        /// </summary>
        [Output("remotePath")]
        public Output<string> RemotePath { get; private set; } = null!;


        /// <summary>
        /// Create a CopyFile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CopyFile(string name, CopyFileArgs args, CustomResourceOptions? options = null)
            : base("command:remote:CopyFile", name, args ?? new CopyFileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CopyFile(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("command:remote:CopyFile", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing CopyFile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CopyFile Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new CopyFile(name, id, options);
        }
    }

    public sealed class CopyFileArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The parameters with which to connect to the remote host.
        /// </summary>
        [Input("connection", required: true)]
        public Input<Inputs.ConnectionArgs> Connection { get; set; } = null!;

        /// <summary>
        /// The file/folder to be copied.
        /// If the input is an Asset, it will be interperted as the contents of a file.
        /// If the input is an Archive, it will be interperted as the contents of a folder.
        /// If the input is a string, it will be interpreted as the path to a file or folder.
        /// Because assets and archives are understood by the Pulumi model, they use should be
        /// prefered to raw paths.
        /// </summary>
        [Input("localPath", required: true)]
        public Input<object> LocalPath { get; set; } = null!;

        /// <summary>
        /// The destination path in the remote host.
        /// </summary>
        [Input("remotePath", required: true)]
        public Input<string> RemotePath { get; set; } = null!;

        public CopyFileArgs()
        {
        }
    }
}
