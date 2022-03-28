package com.casper.sdk.getpeers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GetPeersTest {

    @Test
    fun getPeers() {
        var getPeers:GetPeers = GetPeers()
        var getPeersResult = getPeers.getPeers()
        assertEquals(getPeersResult.api_version,"1.4.5")
        assert(getPeersResult.peers.size>0)
    }
}