// Code generated by pulumi DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package local

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A local command to be executed.
// This command will always be run on any preview or deployment. Use `local.Command` to avoid duplicating executions.
func Run(ctx *pulumi.Context, args *RunArgs, opts ...pulumi.InvokeOption) (*RunResult, error) {
	var rv RunResult
	err := ctx.Invoke("command:local:run", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type RunArgs struct {
	// A list of path globs to return as a single archive asset after the command completes.
	//
	// When specifying glob patterns the following rules apply:
	// - We only include files not directories for assets and archives.
	// - Path separators are `/` on all platforms - including Windows.
	// - Patterns starting with `!` are 'exclude' rules.
	// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
	// - `*` matches anything except `/`
	// - `**` matches anything, _including_ `/`
	// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
	// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
	//
	// #### Example
	//
	// Given the rules:
	//
	// When evaluating against this folder:
	//
	// The following paths will be returned:
	ArchivePaths []string `pulumi:"archivePaths"`
	// A list of path globs to read after the command completes.
	//
	// When specifying glob patterns the following rules apply:
	// - We only include files not directories for assets and archives.
	// - Path separators are `/` on all platforms - including Windows.
	// - Patterns starting with `!` are 'exclude' rules.
	// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
	// - `*` matches anything except `/`
	// - `**` matches anything, _including_ `/`
	// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
	// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
	//
	// #### Example
	//
	// Given the rules:
	//
	// When evaluating against this folder:
	//
	// The following paths will be returned:
	AssetPaths []string `pulumi:"assetPaths"`
	// The command to run.
	Command string `pulumi:"command"`
	// The working directory in which to run the command from.
	Dir *string `pulumi:"dir"`
	// Additional environment variables available to the command's process.
	Environment map[string]string `pulumi:"environment"`
	// The program and arguments to run the command.
	// On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
	Interpreter []string `pulumi:"interpreter"`
	// Pass a string to the command's process as standard in
	Stdin *string `pulumi:"stdin"`
}

type RunResult struct {
	// An archive asset containing files found after running the command.
	Archive pulumi.Archive `pulumi:"archive"`
	// A map of assets found after running the command.
	// The key is the relative path from the command dir
	Assets map[string]pulumi.AssetOrArchive `pulumi:"assets"`
	// The command to run.
	Command string `pulumi:"command"`
	// The directory from which the command was run from.
	Dir *string `pulumi:"dir"`
	// Additional environment variables available to the command's process.
	Environment map[string]string `pulumi:"environment"`
	// The program and arguments to run the command.
	// For example: `["/bin/sh", "-c"]`
	Interpreter []string `pulumi:"interpreter"`
	// The standard error of the command's process
	Stderr string `pulumi:"stderr"`
	// String passed to the command's process as standard in.
	Stdin string `pulumi:"stdin"`
	// The standard output of the command's process
	Stdout *string `pulumi:"stdout"`
}

func RunOutput(ctx *pulumi.Context, args RunOutputArgs, opts ...pulumi.InvokeOption) RunResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (RunResult, error) {
			args := v.(RunArgs)
			r, err := Run(ctx, &args, opts...)
			var s RunResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(RunResultOutput)
}

type RunOutputArgs struct {
	// A list of path globs to return as a single archive asset after the command completes.
	//
	// When specifying glob patterns the following rules apply:
	// - We only include files not directories for assets and archives.
	// - Path separators are `/` on all platforms - including Windows.
	// - Patterns starting with `!` are 'exclude' rules.
	// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
	// - `*` matches anything except `/`
	// - `**` matches anything, _including_ `/`
	// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
	// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
	//
	// #### Example
	//
	// Given the rules:
	//
	// When evaluating against this folder:
	//
	// The following paths will be returned:
	ArchivePaths pulumi.StringArrayInput `pulumi:"archivePaths"`
	// A list of path globs to read after the command completes.
	//
	// When specifying glob patterns the following rules apply:
	// - We only include files not directories for assets and archives.
	// - Path separators are `/` on all platforms - including Windows.
	// - Patterns starting with `!` are 'exclude' rules.
	// - Rules are evaluated in order, so exclude rules should be after inclusion rules.
	// - `*` matches anything except `/`
	// - `**` matches anything, _including_ `/`
	// - All returned paths are relative to the working directory (without leading `./`) e.g. `file.text` or `subfolder/file.txt`.
	// - For full details of the globbing syntax, see [github.com/gobwas/glob](https://github.com/gobwas/glob)
	//
	// #### Example
	//
	// Given the rules:
	//
	// When evaluating against this folder:
	//
	// The following paths will be returned:
	AssetPaths pulumi.StringArrayInput `pulumi:"assetPaths"`
	// The command to run.
	Command pulumi.StringInput `pulumi:"command"`
	// The working directory in which to run the command from.
	Dir pulumi.StringPtrInput `pulumi:"dir"`
	// Additional environment variables available to the command's process.
	Environment pulumi.StringMapInput `pulumi:"environment"`
	// The program and arguments to run the command.
	// On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
	Interpreter pulumi.StringArrayInput `pulumi:"interpreter"`
	// Pass a string to the command's process as standard in
	Stdin pulumi.StringPtrInput `pulumi:"stdin"`
}

func (RunOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*RunArgs)(nil)).Elem()
}

type RunResultOutput struct{ *pulumi.OutputState }

func (RunResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RunResult)(nil)).Elem()
}

func (o RunResultOutput) ToRunResultOutput() RunResultOutput {
	return o
}

func (o RunResultOutput) ToRunResultOutputWithContext(ctx context.Context) RunResultOutput {
	return o
}

// An archive asset containing files found after running the command.
func (o RunResultOutput) Archive() pulumi.ArchiveOutput {
	return o.ApplyT(func(v RunResult) pulumi.Archive { return v.Archive }).(pulumi.ArchiveOutput)
}

// A map of assets found after running the command.
// The key is the relative path from the command dir
func (o RunResultOutput) Assets() pulumi.AssetOrArchiveMapOutput {
	return o.ApplyT(func(v RunResult) map[string]pulumi.AssetOrArchive { return v.Assets }).(pulumi.AssetOrArchiveMapOutput)
}

// The command to run.
func (o RunResultOutput) Command() pulumi.StringOutput {
	return o.ApplyT(func(v RunResult) string { return v.Command }).(pulumi.StringOutput)
}

// The directory from which the command was run from.
func (o RunResultOutput) Dir() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RunResult) *string { return v.Dir }).(pulumi.StringPtrOutput)
}

// Additional environment variables available to the command's process.
func (o RunResultOutput) Environment() pulumi.StringMapOutput {
	return o.ApplyT(func(v RunResult) map[string]string { return v.Environment }).(pulumi.StringMapOutput)
}

// The program and arguments to run the command.
// For example: `["/bin/sh", "-c"]`
func (o RunResultOutput) Interpreter() pulumi.StringArrayOutput {
	return o.ApplyT(func(v RunResult) []string { return v.Interpreter }).(pulumi.StringArrayOutput)
}

// The standard error of the command's process
func (o RunResultOutput) Stderr() pulumi.StringOutput {
	return o.ApplyT(func(v RunResult) string { return v.Stderr }).(pulumi.StringOutput)
}

// String passed to the command's process as standard in.
func (o RunResultOutput) Stdin() pulumi.StringOutput {
	return o.ApplyT(func(v RunResult) string { return v.Stdin }).(pulumi.StringOutput)
}

// The standard output of the command's process
func (o RunResultOutput) Stdout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v RunResult) *string { return v.Stdout }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(RunResultOutput{})
}
