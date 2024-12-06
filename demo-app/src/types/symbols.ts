import type { InjectionKey } from 'vue'
import type { OSDM } from '@/api/main'

export const osdmClientKey: InjectionKey<OSDM> = Symbol('osdm')
