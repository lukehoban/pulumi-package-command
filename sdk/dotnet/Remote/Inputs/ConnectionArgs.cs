// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Command.Remote.Inputs
{

    /// <summary>
    /// Instructions for how to connect to a remote endpoint.
    /// </summary>
    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of the resource to connect to.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// The password we should use for the connection.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The port to connect to.
        /// </summary>
        [Input("port")]
        public Input<double>? Port { get; set; }

        /// <summary>
        /// The contents of an SSH key to use for the connection. This takes preference over the password if provided.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// The user that we should use for the connection.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public ConnectionArgs()
        {
            Port = 22;
            User = "root";
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }
}
