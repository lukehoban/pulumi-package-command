// Code generated by pulumigen DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package remote

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Copy a local file to a remote host.
type CopyFile struct {
	pulumi.CustomResourceState

	// The parameters with which to connect to the remote host.
	Connection ConnectionOutput `pulumi:"connection"`
	// The path of the file to be copied.
	LocalPath pulumi.StringOutput `pulumi:"localPath"`
	// The destination path in the remote host.
	RemotePath pulumi.StringOutput `pulumi:"remotePath"`
	// Trigger replacements on changes to this input.
	Triggers pulumi.ArrayOutput `pulumi:"triggers"`
}

// NewCopyFile registers a new resource with the given unique name, arguments, and options.
func NewCopyFile(ctx *pulumi.Context,
	name string, args *CopyFileArgs, opts ...pulumi.ResourceOption) (*CopyFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Connection == nil {
		return nil, errors.New("invalid value for required argument 'Connection'")
	}
	if args.LocalPath == nil {
		return nil, errors.New("invalid value for required argument 'LocalPath'")
	}
	if args.RemotePath == nil {
		return nil, errors.New("invalid value for required argument 'RemotePath'")
	}
	args.Connection = args.Connection.ToConnectionOutput().ApplyT(func(v Connection) Connection { return *v.Defaults() }).(ConnectionOutput)
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"connection",
	})
	opts = append(opts, secrets)
	var resource CopyFile
	err := ctx.RegisterResource("command:remote:CopyFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCopyFile gets an existing CopyFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCopyFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CopyFileState, opts ...pulumi.ResourceOption) (*CopyFile, error) {
	var resource CopyFile
	err := ctx.ReadResource("command:remote:CopyFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CopyFile resources.
type copyFileState struct {
}

type CopyFileState struct {
}

func (CopyFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*copyFileState)(nil)).Elem()
}

type copyFileArgs struct {
	// The parameters with which to connect to the remote host.
	Connection Connection `pulumi:"connection"`
	// The path of the file to be copied.
	LocalPath string `pulumi:"localPath"`
	// The destination path in the remote host.
	RemotePath string `pulumi:"remotePath"`
	// Trigger replacements on changes to this input.
	Triggers []interface{} `pulumi:"triggers"`
}

// The set of arguments for constructing a CopyFile resource.
type CopyFileArgs struct {
	// The parameters with which to connect to the remote host.
	Connection ConnectionInput
	// The path of the file to be copied.
	LocalPath pulumi.StringInput
	// The destination path in the remote host.
	RemotePath pulumi.StringInput
	// Trigger replacements on changes to this input.
	Triggers pulumi.ArrayInput
}

func (CopyFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*copyFileArgs)(nil)).Elem()
}

type CopyFileInput interface {
	pulumi.Input

	ToCopyFileOutput() CopyFileOutput
	ToCopyFileOutputWithContext(ctx context.Context) CopyFileOutput
}

func (*CopyFile) ElementType() reflect.Type {
	return reflect.TypeOf((**CopyFile)(nil)).Elem()
}

func (i *CopyFile) ToCopyFileOutput() CopyFileOutput {
	return i.ToCopyFileOutputWithContext(context.Background())
}

func (i *CopyFile) ToCopyFileOutputWithContext(ctx context.Context) CopyFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CopyFileOutput)
}

// CopyFileArrayInput is an input type that accepts CopyFileArray and CopyFileArrayOutput values.
// You can construct a concrete instance of `CopyFileArrayInput` via:
//
//	CopyFileArray{ CopyFileArgs{...} }
type CopyFileArrayInput interface {
	pulumi.Input

	ToCopyFileArrayOutput() CopyFileArrayOutput
	ToCopyFileArrayOutputWithContext(context.Context) CopyFileArrayOutput
}

type CopyFileArray []CopyFileInput

func (CopyFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CopyFile)(nil)).Elem()
}

func (i CopyFileArray) ToCopyFileArrayOutput() CopyFileArrayOutput {
	return i.ToCopyFileArrayOutputWithContext(context.Background())
}

func (i CopyFileArray) ToCopyFileArrayOutputWithContext(ctx context.Context) CopyFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CopyFileArrayOutput)
}

// CopyFileMapInput is an input type that accepts CopyFileMap and CopyFileMapOutput values.
// You can construct a concrete instance of `CopyFileMapInput` via:
//
//	CopyFileMap{ "key": CopyFileArgs{...} }
type CopyFileMapInput interface {
	pulumi.Input

	ToCopyFileMapOutput() CopyFileMapOutput
	ToCopyFileMapOutputWithContext(context.Context) CopyFileMapOutput
}

type CopyFileMap map[string]CopyFileInput

func (CopyFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CopyFile)(nil)).Elem()
}

func (i CopyFileMap) ToCopyFileMapOutput() CopyFileMapOutput {
	return i.ToCopyFileMapOutputWithContext(context.Background())
}

func (i CopyFileMap) ToCopyFileMapOutputWithContext(ctx context.Context) CopyFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CopyFileMapOutput)
}

type CopyFileOutput struct{ *pulumi.OutputState }

func (CopyFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CopyFile)(nil)).Elem()
}

func (o CopyFileOutput) ToCopyFileOutput() CopyFileOutput {
	return o
}

func (o CopyFileOutput) ToCopyFileOutputWithContext(ctx context.Context) CopyFileOutput {
	return o
}

// The parameters with which to connect to the remote host.
func (o CopyFileOutput) Connection() ConnectionOutput {
	return o.ApplyT(func(v *CopyFile) ConnectionOutput { return v.Connection }).(ConnectionOutput)
}

// The path of the file to be copied.
func (o CopyFileOutput) LocalPath() pulumi.StringOutput {
	return o.ApplyT(func(v *CopyFile) pulumi.StringOutput { return v.LocalPath }).(pulumi.StringOutput)
}

// The destination path in the remote host.
func (o CopyFileOutput) RemotePath() pulumi.StringOutput {
	return o.ApplyT(func(v *CopyFile) pulumi.StringOutput { return v.RemotePath }).(pulumi.StringOutput)
}

// Trigger replacements on changes to this input.
func (o CopyFileOutput) Triggers() pulumi.ArrayOutput {
	return o.ApplyT(func(v *CopyFile) pulumi.ArrayOutput { return v.Triggers }).(pulumi.ArrayOutput)
}

type CopyFileArrayOutput struct{ *pulumi.OutputState }

func (CopyFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CopyFile)(nil)).Elem()
}

func (o CopyFileArrayOutput) ToCopyFileArrayOutput() CopyFileArrayOutput {
	return o
}

func (o CopyFileArrayOutput) ToCopyFileArrayOutputWithContext(ctx context.Context) CopyFileArrayOutput {
	return o
}

func (o CopyFileArrayOutput) Index(i pulumi.IntInput) CopyFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CopyFile {
		return vs[0].([]*CopyFile)[vs[1].(int)]
	}).(CopyFileOutput)
}

type CopyFileMapOutput struct{ *pulumi.OutputState }

func (CopyFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CopyFile)(nil)).Elem()
}

func (o CopyFileMapOutput) ToCopyFileMapOutput() CopyFileMapOutput {
	return o
}

func (o CopyFileMapOutput) ToCopyFileMapOutputWithContext(ctx context.Context) CopyFileMapOutput {
	return o
}

func (o CopyFileMapOutput) MapIndex(k pulumi.StringInput) CopyFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CopyFile {
		return vs[0].(map[string]*CopyFile)[vs[1].(string)]
	}).(CopyFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CopyFileInput)(nil)).Elem(), &CopyFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*CopyFileArrayInput)(nil)).Elem(), CopyFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CopyFileMapInput)(nil)).Elem(), CopyFileMap{})
	pulumi.RegisterOutputType(CopyFileOutput{})
	pulumi.RegisterOutputType(CopyFileArrayOutput{})
	pulumi.RegisterOutputType(CopyFileMapOutput{})
}
