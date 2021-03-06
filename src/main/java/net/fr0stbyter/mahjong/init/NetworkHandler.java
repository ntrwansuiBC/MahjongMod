package net.fr0stbyter.mahjong.init;

import net.fr0stbyter.mahjong.Mahjong;
import net.fr0stbyter.mahjong.network.message.MessageMj;
import net.fr0stbyter.mahjong.network.message.MessageMjIsInGame;
import net.fr0stbyter.mahjong.network.message.MessageMjStatus;
import net.fr0stbyter.mahjong.network.message.MessageMjTable;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Mahjong.MODID);

    public static void init() {
        INSTANCE.registerMessage(MessageMjTable.class, MessageMjTable.class, 0, Side.SERVER);
        INSTANCE.registerMessage(MessageMj.class, MessageMj.class, 1, Side.SERVER);
        INSTANCE.registerMessage(MessageMjStatus.class, MessageMjStatus.class, 2, Side.CLIENT);
        INSTANCE.registerMessage(MessageMjIsInGame.class, MessageMjIsInGame.class, 3, Side.CLIENT);
    }
}
