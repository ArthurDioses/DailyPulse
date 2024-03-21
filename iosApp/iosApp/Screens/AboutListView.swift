//
//  AboutListView.swift
//  iosApp
//
//  Created by Arthur Felipe Dioses Reto on 19/03/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import shared
import SwiftUI

struct AboutListView: View {
    private struct RowItem: Hashable{
        let title:String
        let subTitle:String
    }
    
    private let items: [RowItem] = {
        let platform = Platform()
        platform.logSystemInfo()
        
        var result:[RowItem]=[
            .init(title: "Operating System", subTilte: "\(platform.osName) \(platform.osVersion)"),
            .init(title: "Device", subTilte: platform.deviceModel),
            .init(title: "Density", subTilte: "@\(platform.density)x")
        ]
        return result
    }()
    
    var body:some View{
        List{
            ForEach(items, id: \.self){item in
                VStack(alignment: .leading){
                    Text(item.title)
                        .font(.footnote)
                        .foregroundStyle(.secondary)
                    Text(item.subTilte)
                        .font(.body)
                        .foregroundStyle(.primary)
                }
                .padding(.vertical,4)
            }
        }
    }
}
#Preview {
    AboutListView()
}
