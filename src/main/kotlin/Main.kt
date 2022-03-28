import com.casper.sdk.getpeers.GetPeers
import com.casper.sdk.getstateroothash.GetStateRootHash
import net.jemzart.jsonkraken.*

fun main(args: Array<String>) {
    var getStateRootHash:GetStateRootHash = GetStateRootHash()
    getStateRootHash.getStateRootHash()

    var getPeers:GetPeers = GetPeers()
    var getPeersResult =    getPeers.getPeers()
    println("Get peer result, api_version:" + getPeersResult.api_version + " total peer:" + getPeersResult.peers.size)
}