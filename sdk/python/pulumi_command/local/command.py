# coding=utf-8
# *** WARNING: this file was generated by pulumigen. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CommandArgs', 'Command']

@pulumi.input_type
class CommandArgs:
    def __init__(__self__, *,
                 archive_paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 asset_paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 create: Optional[pulumi.Input[str]] = None,
                 delete: Optional[pulumi.Input[str]] = None,
                 dir: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 interpreter: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 stdin: Optional[pulumi.Input[str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[Any]]] = None,
                 update: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Command resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] archive_paths: A list of path globs to return as a single archive asset after the command completes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] asset_paths: A list of path globs to read after the command completes.
        :param pulumi.Input[str] create: The command to run on create.
        :param pulumi.Input[str] delete: The command to run on delete.
        :param pulumi.Input[str] dir: The working directory in which to run the command from.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] environment: Additional environment variables available to the command's process.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] interpreter: The program and arguments to run the command.
               On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
        :param pulumi.Input[str] stdin: Pass a string to the command's process as standard in
        :param pulumi.Input[str] update: The command to run on update, if empty, create will run again.
        """
        if archive_paths is not None:
            pulumi.set(__self__, "archive_paths", archive_paths)
        if asset_paths is not None:
            pulumi.set(__self__, "asset_paths", asset_paths)
        if create is not None:
            pulumi.set(__self__, "create", create)
        if delete is not None:
            pulumi.set(__self__, "delete", delete)
        if dir is not None:
            pulumi.set(__self__, "dir", dir)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if interpreter is not None:
            pulumi.set(__self__, "interpreter", interpreter)
        if stdin is not None:
            pulumi.set(__self__, "stdin", stdin)
        if triggers is not None:
            pulumi.set(__self__, "triggers", triggers)
        if update is not None:
            pulumi.set(__self__, "update", update)

    @property
    @pulumi.getter(name="archivePaths")
    def archive_paths(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of path globs to return as a single archive asset after the command completes.
        """
        return pulumi.get(self, "archive_paths")

    @archive_paths.setter
    def archive_paths(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "archive_paths", value)

    @property
    @pulumi.getter(name="assetPaths")
    def asset_paths(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of path globs to read after the command completes.
        """
        return pulumi.get(self, "asset_paths")

    @asset_paths.setter
    def asset_paths(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "asset_paths", value)

    @property
    @pulumi.getter
    def create(self) -> Optional[pulumi.Input[str]]:
        """
        The command to run on create.
        """
        return pulumi.get(self, "create")

    @create.setter
    def create(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create", value)

    @property
    @pulumi.getter
    def delete(self) -> Optional[pulumi.Input[str]]:
        """
        The command to run on delete.
        """
        return pulumi.get(self, "delete")

    @delete.setter
    def delete(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "delete", value)

    @property
    @pulumi.getter
    def dir(self) -> Optional[pulumi.Input[str]]:
        """
        The working directory in which to run the command from.
        """
        return pulumi.get(self, "dir")

    @dir.setter
    def dir(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dir", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Additional environment variables available to the command's process.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def interpreter(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The program and arguments to run the command.
        On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
        """
        return pulumi.get(self, "interpreter")

    @interpreter.setter
    def interpreter(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "interpreter", value)

    @property
    @pulumi.getter
    def stdin(self) -> Optional[pulumi.Input[str]]:
        """
        Pass a string to the command's process as standard in
        """
        return pulumi.get(self, "stdin")

    @stdin.setter
    def stdin(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stdin", value)

    @property
    @pulumi.getter
    def triggers(self) -> Optional[pulumi.Input[Sequence[Any]]]:
        return pulumi.get(self, "triggers")

    @triggers.setter
    def triggers(self, value: Optional[pulumi.Input[Sequence[Any]]]):
        pulumi.set(self, "triggers", value)

    @property
    @pulumi.getter
    def update(self) -> Optional[pulumi.Input[str]]:
        """
        The command to run on update, if empty, create will run again.
        """
        return pulumi.get(self, "update")

    @update.setter
    def update(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "update", value)


class Command(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 archive_paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 asset_paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 create: Optional[pulumi.Input[str]] = None,
                 delete: Optional[pulumi.Input[str]] = None,
                 dir: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 interpreter: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 stdin: Optional[pulumi.Input[str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[Any]]] = None,
                 update: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A local command to be executed.
        This command can be inserted into the life cycles of other resources using the
        `dependsOn` or `parent` resource options. A command is considered to have
        failed when it finished with a non-zero exit code. This will fail the CRUD step
        of the `Command` resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] archive_paths: A list of path globs to return as a single archive asset after the command completes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] asset_paths: A list of path globs to read after the command completes.
        :param pulumi.Input[str] create: The command to run on create.
        :param pulumi.Input[str] delete: The command to run on delete.
        :param pulumi.Input[str] dir: The working directory in which to run the command from.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] environment: Additional environment variables available to the command's process.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] interpreter: The program and arguments to run the command.
               On Linux and macOS, defaults to: `["/bin/sh", "-c"]`. On Windows, defaults to: `["cmd", "/C"]`
        :param pulumi.Input[str] stdin: Pass a string to the command's process as standard in
        :param pulumi.Input[str] update: The command to run on update, if empty, create will run again.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[CommandArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A local command to be executed.
        This command can be inserted into the life cycles of other resources using the
        `dependsOn` or `parent` resource options. A command is considered to have
        failed when it finished with a non-zero exit code. This will fail the CRUD step
        of the `Command` resource.

        :param str resource_name: The name of the resource.
        :param CommandArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CommandArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 archive_paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 asset_paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 create: Optional[pulumi.Input[str]] = None,
                 delete: Optional[pulumi.Input[str]] = None,
                 dir: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 interpreter: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 stdin: Optional[pulumi.Input[str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[Any]]] = None,
                 update: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CommandArgs.__new__(CommandArgs)

            __props__.__dict__["archive_paths"] = archive_paths
            __props__.__dict__["asset_paths"] = asset_paths
            __props__.__dict__["create"] = create
            __props__.__dict__["delete"] = delete
            __props__.__dict__["dir"] = dir
            __props__.__dict__["environment"] = environment
            __props__.__dict__["interpreter"] = interpreter
            __props__.__dict__["stdin"] = stdin
            __props__.__dict__["triggers"] = triggers
            __props__.__dict__["update"] = update
            __props__.__dict__["archive"] = None
            __props__.__dict__["assets"] = None
            __props__.__dict__["stderr"] = None
            __props__.__dict__["stdout"] = None
        super(Command, __self__).__init__(
            'command:local:Command',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'Command':
        """
        Get an existing Command resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = CommandArgs.__new__(CommandArgs)

        __props__.__dict__["archive"] = None
        __props__.__dict__["archive_paths"] = None
        __props__.__dict__["asset_paths"] = None
        __props__.__dict__["assets"] = None
        __props__.__dict__["create"] = None
        __props__.__dict__["delete"] = None
        __props__.__dict__["dir"] = None
        __props__.__dict__["environment"] = None
        __props__.__dict__["interpreter"] = None
        __props__.__dict__["stderr"] = None
        __props__.__dict__["stdin"] = None
        __props__.__dict__["stdout"] = None
        __props__.__dict__["triggers"] = None
        __props__.__dict__["update"] = None
        return Command(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def archive(self) -> pulumi.Output[Optional[pulumi.Archive]]:
        """
        An archive asset containing files found after running the command.
        """
        return pulumi.get(self, "archive")

    @property
    @pulumi.getter(name="archivePaths")
    def archive_paths(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of path globs to return as a single archive asset after the command completes.
        """
        return pulumi.get(self, "archive_paths")

    @property
    @pulumi.getter(name="assetPaths")
    def asset_paths(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of path globs to read after the command completes.
        """
        return pulumi.get(self, "asset_paths")

    @property
    @pulumi.getter
    def assets(self) -> pulumi.Output[Optional[Mapping[str, Union[pulumi.Asset, pulumi.Archive]]]]:
        """
        A map of assets found after running the command.
        The key is the relative path from the command dir
        """
        return pulumi.get(self, "assets")

    @property
    @pulumi.getter
    def create(self) -> pulumi.Output[Optional[str]]:
        """
        The command to run on create.
        """
        return pulumi.get(self, "create")

    @property
    @pulumi.getter
    def delete(self) -> pulumi.Output[Optional[str]]:
        """
        The command to run on delete.
        """
        return pulumi.get(self, "delete")

    @property
    @pulumi.getter
    def dir(self) -> pulumi.Output[Optional[str]]:
        """
        The directory from which to run the command from. If `dir` does not exist, then
        `Command` will fail.
        """
        return pulumi.get(self, "dir")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Additional environment variables available to the command's process.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def interpreter(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The program and arguments to run the command.
        For example: `["/bin/sh", "-c"]`
        """
        return pulumi.get(self, "interpreter")

    @property
    @pulumi.getter
    def stderr(self) -> pulumi.Output[str]:
        """
        The standard error of the command's process
        """
        return pulumi.get(self, "stderr")

    @property
    @pulumi.getter
    def stdin(self) -> pulumi.Output[Optional[str]]:
        """
        Pass a string to the command's process as standard in
        """
        return pulumi.get(self, "stdin")

    @property
    @pulumi.getter
    def stdout(self) -> pulumi.Output[str]:
        """
        The standard output of the command's process
        """
        return pulumi.get(self, "stdout")

    @property
    @pulumi.getter
    def triggers(self) -> pulumi.Output[Optional[Sequence[Any]]]:
        """
        Trigger replacements on changes to this input.
        """
        return pulumi.get(self, "triggers")

    @property
    @pulumi.getter
    def update(self) -> pulumi.Output[Optional[str]]:
        """
        The command to run on update, if empty, create will run again.
        """
        return pulumi.get(self, "update")

