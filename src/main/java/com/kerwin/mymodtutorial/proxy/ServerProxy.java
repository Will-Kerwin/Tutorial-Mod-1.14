package com.kerwin.mymodtutorial.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Cant accsess the server on client banana");
    }
}
