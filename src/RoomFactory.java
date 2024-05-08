class RoomFactory {
    public static RoomStrategy createRoom(String roomType) {
        switch (roomType) {
            case "normal":
                return new NormalRoomStrategy();
            case "treasure":
                return new TreasureRoomStrategy();
            case "monster":
                return new MonsterRoomStrategy();
            default:
                return null;
        }
    }
}