// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package remote

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-command/sdk/go/command/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Copy an Asset or Archive to a remote host.
type Copy struct {
	pulumi.CustomResourceState

	// The parameters with which to connect to the remote host.
	Connection ConnectionOutput `pulumi:"connection"`
	// An archive to upload as the source of the copy. It must be a path based archive. Only one of Asset or Archive can be set.
	LocalArchive pulumi.ArchiveOutput `pulumi:"localArchive"`
	// An asset to upload as the source of the copy. It must be a path based asset. Only one of Asset or Archive can be set.
	LocalAsset pulumi.AssetOrArchiveOutput `pulumi:"localAsset"`
	// The destination path in the remote host.
	RemotePath pulumi.StringOutput `pulumi:"remotePath"`
	// Trigger replacements on changes to this input.
	Triggers pulumi.ArrayOutput `pulumi:"triggers"`
}

// NewCopy registers a new resource with the given unique name, arguments, and options.
func NewCopy(ctx *pulumi.Context,
	name string, args *CopyArgs, opts ...pulumi.ResourceOption) (*Copy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Connection == nil {
		return nil, errors.New("invalid value for required argument 'Connection'")
	}
	if args.RemotePath == nil {
		return nil, errors.New("invalid value for required argument 'RemotePath'")
	}
	args.Connection = args.Connection.ToConnectionOutput().ApplyT(func(v Connection) Connection { return *v.Defaults() }).(ConnectionOutput)
	if args.Connection != nil {
		args.Connection = pulumi.ToSecret(args.Connection).(ConnectionInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"connection",
	})
	opts = append(opts, secrets)
	replaceOnChanges := pulumi.ReplaceOnChanges([]string{
		"triggers[*]",
	})
	opts = append(opts, replaceOnChanges)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Copy
	err := ctx.RegisterResource("command:remote:Copy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCopy gets an existing Copy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCopy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CopyState, opts ...pulumi.ResourceOption) (*Copy, error) {
	var resource Copy
	err := ctx.ReadResource("command:remote:Copy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Copy resources.
type copyState struct {
}

type CopyState struct {
}

func (CopyState) ElementType() reflect.Type {
	return reflect.TypeOf((*copyState)(nil)).Elem()
}

type copyArgs struct {
	// The parameters with which to connect to the remote host.
	Connection Connection `pulumi:"connection"`
	// An archive to upload as the source of the copy. It must be a path based archive. Only one of Asset or Archive can be set.
	LocalArchive pulumi.Archive `pulumi:"localArchive"`
	// An asset to upload as the source of the copy. It must be a path based asset. Only one of Asset or Archive can be set.
	LocalAsset pulumi.AssetOrArchive `pulumi:"localAsset"`
	// The destination path in the remote host.
	RemotePath string `pulumi:"remotePath"`
	// Trigger replacements on changes to this input.
	Triggers []interface{} `pulumi:"triggers"`
}

// The set of arguments for constructing a Copy resource.
type CopyArgs struct {
	// The parameters with which to connect to the remote host.
	Connection ConnectionInput
	// An archive to upload as the source of the copy. It must be a path based archive. Only one of Asset or Archive can be set.
	LocalArchive pulumi.ArchiveInput
	// An asset to upload as the source of the copy. It must be a path based asset. Only one of Asset or Archive can be set.
	LocalAsset pulumi.AssetOrArchiveInput
	// The destination path in the remote host.
	RemotePath pulumi.StringInput
	// Trigger replacements on changes to this input.
	Triggers pulumi.ArrayInput
}

func (CopyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*copyArgs)(nil)).Elem()
}

type CopyInput interface {
	pulumi.Input

	ToCopyOutput() CopyOutput
	ToCopyOutputWithContext(ctx context.Context) CopyOutput
}

func (*Copy) ElementType() reflect.Type {
	return reflect.TypeOf((**Copy)(nil)).Elem()
}

func (i *Copy) ToCopyOutput() CopyOutput {
	return i.ToCopyOutputWithContext(context.Background())
}

func (i *Copy) ToCopyOutputWithContext(ctx context.Context) CopyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CopyOutput)
}

// CopyArrayInput is an input type that accepts CopyArray and CopyArrayOutput values.
// You can construct a concrete instance of `CopyArrayInput` via:
//
//	CopyArray{ CopyArgs{...} }
type CopyArrayInput interface {
	pulumi.Input

	ToCopyArrayOutput() CopyArrayOutput
	ToCopyArrayOutputWithContext(context.Context) CopyArrayOutput
}

type CopyArray []CopyInput

func (CopyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Copy)(nil)).Elem()
}

func (i CopyArray) ToCopyArrayOutput() CopyArrayOutput {
	return i.ToCopyArrayOutputWithContext(context.Background())
}

func (i CopyArray) ToCopyArrayOutputWithContext(ctx context.Context) CopyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CopyArrayOutput)
}

// CopyMapInput is an input type that accepts CopyMap and CopyMapOutput values.
// You can construct a concrete instance of `CopyMapInput` via:
//
//	CopyMap{ "key": CopyArgs{...} }
type CopyMapInput interface {
	pulumi.Input

	ToCopyMapOutput() CopyMapOutput
	ToCopyMapOutputWithContext(context.Context) CopyMapOutput
}

type CopyMap map[string]CopyInput

func (CopyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Copy)(nil)).Elem()
}

func (i CopyMap) ToCopyMapOutput() CopyMapOutput {
	return i.ToCopyMapOutputWithContext(context.Background())
}

func (i CopyMap) ToCopyMapOutputWithContext(ctx context.Context) CopyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CopyMapOutput)
}

type CopyOutput struct{ *pulumi.OutputState }

func (CopyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Copy)(nil)).Elem()
}

func (o CopyOutput) ToCopyOutput() CopyOutput {
	return o
}

func (o CopyOutput) ToCopyOutputWithContext(ctx context.Context) CopyOutput {
	return o
}

// The parameters with which to connect to the remote host.
func (o CopyOutput) Connection() ConnectionOutput {
	return o.ApplyT(func(v *Copy) ConnectionOutput { return v.Connection }).(ConnectionOutput)
}

// An archive to upload as the source of the copy. It must be a path based archive. Only one of Asset or Archive can be set.
func (o CopyOutput) LocalArchive() pulumi.ArchiveOutput {
	return o.ApplyT(func(v *Copy) pulumi.ArchiveOutput { return v.LocalArchive }).(pulumi.ArchiveOutput)
}

// An asset to upload as the source of the copy. It must be a path based asset. Only one of Asset or Archive can be set.
func (o CopyOutput) LocalAsset() pulumi.AssetOrArchiveOutput {
	return o.ApplyT(func(v *Copy) pulumi.AssetOrArchiveOutput { return v.LocalAsset }).(pulumi.AssetOrArchiveOutput)
}

// The destination path in the remote host.
func (o CopyOutput) RemotePath() pulumi.StringOutput {
	return o.ApplyT(func(v *Copy) pulumi.StringOutput { return v.RemotePath }).(pulumi.StringOutput)
}

// Trigger replacements on changes to this input.
func (o CopyOutput) Triggers() pulumi.ArrayOutput {
	return o.ApplyT(func(v *Copy) pulumi.ArrayOutput { return v.Triggers }).(pulumi.ArrayOutput)
}

type CopyArrayOutput struct{ *pulumi.OutputState }

func (CopyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Copy)(nil)).Elem()
}

func (o CopyArrayOutput) ToCopyArrayOutput() CopyArrayOutput {
	return o
}

func (o CopyArrayOutput) ToCopyArrayOutputWithContext(ctx context.Context) CopyArrayOutput {
	return o
}

func (o CopyArrayOutput) Index(i pulumi.IntInput) CopyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Copy {
		return vs[0].([]*Copy)[vs[1].(int)]
	}).(CopyOutput)
}

type CopyMapOutput struct{ *pulumi.OutputState }

func (CopyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Copy)(nil)).Elem()
}

func (o CopyMapOutput) ToCopyMapOutput() CopyMapOutput {
	return o
}

func (o CopyMapOutput) ToCopyMapOutputWithContext(ctx context.Context) CopyMapOutput {
	return o
}

func (o CopyMapOutput) MapIndex(k pulumi.StringInput) CopyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Copy {
		return vs[0].(map[string]*Copy)[vs[1].(string)]
	}).(CopyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CopyInput)(nil)).Elem(), &Copy{})
	pulumi.RegisterInputType(reflect.TypeOf((*CopyArrayInput)(nil)).Elem(), CopyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CopyMapInput)(nil)).Elem(), CopyMap{})
	pulumi.RegisterOutputType(CopyOutput{})
	pulumi.RegisterOutputType(CopyArrayOutput{})
	pulumi.RegisterOutputType(CopyMapOutput{})
}
