/*
 * XML Type:  getTiposDeRegistroDeAverbacaoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeRegistroDeAverbacaoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeRegistroDeAverbacaoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeRegistroDeAverbacaoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEREGISTRODEAVERBACAO$0 = 
        new javax.xml.namespace.QName("", "tiposDeRegistroDeAverbacao");
    
    
    /**
     * Gets array of all "tiposDeRegistroDeAverbacao" elements
     */
    public br.jus.tjsc.www.selo.TipoRegistroAverbacao[] getTiposDeRegistroDeAverbacaoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEREGISTRODEAVERBACAO$0, targetList);
            br.jus.tjsc.www.selo.TipoRegistroAverbacao[] result = new br.jus.tjsc.www.selo.TipoRegistroAverbacao[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeRegistroDeAverbacao" element
     */
    public br.jus.tjsc.www.selo.TipoRegistroAverbacao getTiposDeRegistroDeAverbacaoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoRegistroAverbacao target = null;
            target = (br.jus.tjsc.www.selo.TipoRegistroAverbacao)get_store().find_element_user(TIPOSDEREGISTRODEAVERBACAO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeRegistroDeAverbacao" element
     */
    public int sizeOfTiposDeRegistroDeAverbacaoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEREGISTRODEAVERBACAO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeRegistroDeAverbacao" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeRegistroDeAverbacaoArray(br.jus.tjsc.www.selo.TipoRegistroAverbacao[] tiposDeRegistroDeAverbacaoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeRegistroDeAverbacaoArray, TIPOSDEREGISTRODEAVERBACAO$0);
    }
    
    /**
     * Sets ith "tiposDeRegistroDeAverbacao" element
     */
    public void setTiposDeRegistroDeAverbacaoArray(int i, br.jus.tjsc.www.selo.TipoRegistroAverbacao tiposDeRegistroDeAverbacao)
    {
        generatedSetterHelperImpl(tiposDeRegistroDeAverbacao, TIPOSDEREGISTRODEAVERBACAO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeRegistroDeAverbacao" element
     */
    public br.jus.tjsc.www.selo.TipoRegistroAverbacao insertNewTiposDeRegistroDeAverbacao(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoRegistroAverbacao target = null;
            target = (br.jus.tjsc.www.selo.TipoRegistroAverbacao)get_store().insert_element_user(TIPOSDEREGISTRODEAVERBACAO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeRegistroDeAverbacao" element
     */
    public br.jus.tjsc.www.selo.TipoRegistroAverbacao addNewTiposDeRegistroDeAverbacao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoRegistroAverbacao target = null;
            target = (br.jus.tjsc.www.selo.TipoRegistroAverbacao)get_store().add_element_user(TIPOSDEREGISTRODEAVERBACAO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeRegistroDeAverbacao" element
     */
    public void removeTiposDeRegistroDeAverbacao(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEREGISTRODEAVERBACAO$0, i);
        }
    }
}
